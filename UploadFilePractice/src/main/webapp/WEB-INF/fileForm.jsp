<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Upload The File</h1>

<form action="uploadSuccess" method="post" enctype="multipart/form-data">
<label for="f">upload file</label>
<input type="file" id="f" name="file"><br></br>
<button type="submit">Upload</button>

</form>
</body>
</html>