
package servlets;

import domain.Note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note = new Note();
        if (edit == null) {
            try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
                note.setTitle(br.readLine());
                note.setContent(br.readLine());
            }

            request.setAttribute("title", note.getTitle());
            request.setAttribute("content", note.getContent());

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note = new Note();

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        note.setTitle(title);
        note.setContent(content);

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            pw.println(note.getTitle());
            pw.println(note.getContent());
        }

        request.setAttribute("title", title);
        request.setAttribute("content", content);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

    }
}
