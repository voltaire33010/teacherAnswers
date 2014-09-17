<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Faculty Administration </title>
   

<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

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
<h2>${user}</h2>
<h2><spring:message code="admin.text"/></h2>
language: <a href="?language=en">English</a> |  <a href="?language=es">Spanish</a>
<form:form commandName="professor" >
<form:errors path="*" cssClass="errorblock" element="div" />
<table>
<tr>
<td>Professor name: </td>
 <td><form:input path="pname"  cssErrorClass="error"/></td>
<td><form:errors path="pname"  cssClass="error"/></td> 
<%-- <td><form:select id="professors" path="pname"></form:select> --%>
</tr>
<tr>
<td>Subject: </td>
<td><form:input path="psubject"/></td>
</tr>
<!-- <tr>
<td><input type="hidden" name=${_csrf.parameterName} value=${_csrf.token} /></td>
</tr>-->
<tr> 
 <td colspan="3"><input type="submit" value="enter"></td> 
 </tr>
 
</table>

</form:form>
  <%-- <h3>The last question was: ${fn:escapeXml(problem.question) } from ${problem.professor.pname}</h3>  --%> 
   <h3><spring:message code="question.last"/> ${problem.question} from ${problem.professor.pname} </h3>    
<h1>${error}</h1>
<a href=http://localhost:8080/TeacherAnswers/addQuestion.html>Add Question</a>
<table>
<tr>
<td>Spring Book </td>
<td><a href=pdfs/pro_spring_3.pdf>pro spring 3.1</a></td>

</tr>
<tr>
<td>Spring Book </td>
<td><a href=pdfs/spring_in_practice.pdf>spring in practice</a></td>
</tr>
<tr>
<td>Subject References </td>
<td><form action="redirect.html" Method="get">
<select name="url">
  <option value="https://en.wikipedia.org/wiki/Mathematics">Mathematics</option>
  <option value="https://en.wikipedia.org/wiki/Literature">Literature</option>
  <option value="https://en.wikipedia.org/wiki/Physics">Physics</option>
  <option value="https://en.wikipedia.org/wiki/Grammar">Grammar</option>
</select>
<input type="submit" value="Submit">
</form></td>
</tr>
</table>
</body>
<script type="text/javascript" src="jquery-1.10.2.js"></script>

<script>
$(document).ready(
		
		function(){
			$(document).ready(
					
					function() {
						//$.getJSON('http://localhost:8080/TeacherAnswers/professors.json', {
							$.getJSON('<spring:url value="professors.json"/>', {
							ajax : 'true'
						}, function(data){
							var html = '<option value="">--Please select one--</option>';
							var len = data.length;
							for (var i = 0; i < len; i++) {
								html += '<option value="' + data[i].pname + '">'
										+ data[i].pname + '</option>';
							}
							html += '</option>';
							
							$('#professors').html(html);
						});
						
					});});

</script>
</html>