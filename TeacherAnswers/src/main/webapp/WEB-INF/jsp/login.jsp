<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Answer</title>
</head>
<body>
<%-- <% int count=0;
if(request.getParameter("error") != null){
        
        count=count++;
        out.println("ERROR LOGIN "+count);
} %> --%>
<a href=http://localhost:8080/TeacherAnswers/j_spring_security_logout>logout</a>
    <form action="j_spring_security_check"  method="post">
    <table>
    <tr>
       <td> Username</td>
       <td><input type="text" name="j_username"/></td>
        </tr>
        <tr>
       <td> Password</td>
       <td><input type="password" name="j_password"/></td>
        </tr>
        <tr>
       <td colspan="2"> <input type="submit" value="Log In"/></td>
        </tr>
        </table>
    </form>
</body>
</html>