<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Add Problem</title>
</head>
<body>
<a href=j_spring_security_logout>logout</a>
<form:form commandName="problem">
<table>
<tr>
<td>Enter Problem</td>
<td><form:textarea path="question" htmlEscape="true" /> </td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="enter question"/></td>
</tr>

</table>


</form:form>
</body>
</html>