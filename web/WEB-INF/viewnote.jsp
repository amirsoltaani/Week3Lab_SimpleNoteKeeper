<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Week 3 Lab</title>
</head>
<body>
<h1>Simple Note Keeper</h1>
<h2>View Note</h2>
<p><b>Title: </b>${title}</p>
<p><b>Contents:</b></p>
<p>${content}</p>
<br>
<a href="note?edit">Edit</a>
</body>
</html>
