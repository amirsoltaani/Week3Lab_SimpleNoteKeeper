
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Note</title>
</head>
<body>
<h1>Simple Note Keeper</h1>
<h2>Edit Note</h2>
<form method="post" action="note">
    <label for="title">Title:</label>
    <input type="text" name="title" id="title" value="${title}">
    <br>
    <label for="content">Content:</label>
    <textarea type="text" name="content" id="content" rows="5" value="${content}"></textarea>
    <br>
    <input type="submit" value="save">
</form>
</body>
</html>
