package domain;

public class Note {
    private String title;
    private String content;

    public Note() {
        title = "This is the title";
        content = "Contents go here";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
