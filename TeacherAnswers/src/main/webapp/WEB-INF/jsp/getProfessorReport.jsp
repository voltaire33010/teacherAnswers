<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Professor Report</title>
<style>
table {
   width: 100%;
 
}

th {
 border-color:#0000ff;
  text-align: left; 
  vertical-align: top; 
  border: 0.1px solid #0000ff;
  border-collapse: collapse;
  padding: 0.3em;
  caption-side: bottom;
  background-color:#70A0D0;
}
 td {
 
  text-align: left; 
  vertical-align: top; 
  border: 0.1px solid #99BCE8;
  border-collapse: collapse;
  padding: 0.3em;
  caption-side: bottom;
  background-color:rgb(250,250,250);
}

caption {
  padding: 0.3em;
}
</style> 
</head>
<body bgcolor="#99BCE8">

	<table>
		<tr>
			<th>Professor</th><th>Problem Questions</th><th>Problem Answer</th>
		</tr>
		<c:forEach items="${professorReport}" var="professorReport">
			<tr>
				<td>${professorReport.professorName}</td><td>${professorReport.problemQuestion}</td><td>${professorreport.problemAnswer}</td>
			</tr>
			
		</c:forEach>
			
	</table>

</body>
</html>