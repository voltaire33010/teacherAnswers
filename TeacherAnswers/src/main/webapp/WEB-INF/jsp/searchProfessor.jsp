<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Search a Professor</title>
</head>
<body>
<table>
<tr>
<td> 
 <canvas id="myCanvas" width="600" height="70"></canvas>
    <script>
      var canvas = document.getElementById('myCanvas');
      var context = canvas.getContext('2d');

      context.font = 'italic 25pt Calibri';
      context.fillText('Java Training Demo', 50, 50);
    </script> 
  </td>
<td><a href=showFaculty.html>Show Faculty</a> | <a href=getProfessorReport.html>Get Professor Report</a>
 | <a href=getProfessors.html>Get Professors</a>
  | <a href=searchProfessor.html>Search Professor</a>
 |  <a href=searchProfessorRecord.html>Search Professor Records</a>
 </td>
</tr>
</table>
<a href=j_spring_security_logout>logout</a>
<form:form commandName="professor">
<table>
<tr>
<td>Enter Professor Name</td>
<td><form:textarea path="pname" htmlEscape="true" /> </td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="enter"/></td>
</tr>

</table>


</form:form>
</body>
</html>