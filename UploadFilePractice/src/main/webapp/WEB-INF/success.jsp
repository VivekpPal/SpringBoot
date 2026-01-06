<%@page import="com.entity.FileInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
file upload succesfully</h1>
<%List<FileInfo> files =(List<FileInfo>)request.getAttribute("files"); %>

<table border="1">
<caption>Files Uploaded</caption>
<tr>
<th> File Id</th>
<th> File Name</th>
<th> File Path</th>
<th>Download</th>
</tr>
<%for(FileInfo file:files){ %>
<tr>
<td><%=file.getId() %></td>
<td><%=file.getFileName() %></td>
<td><%=file.getFilePath() %></td>
<td><a href="download?id=<%=file.getId()%>">download</a></td>
</tr>

<%} %>

</table>



</body>
</html>