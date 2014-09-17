<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Professors Report</title>
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
			<th>ID</th><th>Name</th><th>Java Security Demo</th>
		</tr>
	
		<c:forEach items="${professorReportRecord}" var="professor">
		
			<tr>
				
				<td>${professor.id}</td><td>${professor.pname}</td>
				
				<td>
					<table>
					<colgroup>
                      <col style="width: 13%" />
                      <col style="width: 43%" />
                      <col style="width: 43%" />
                    </colgroup>
						<tr>
							<th>Problem ID</th><th>Problem Question</th><th>Problem Answer</th>
						</tr>
						<c:forEach items="${professor.problems}" var="problem">
							<tr>
								<td>${problem.id}</td><td>${problem.question}</td><td><input type="text name="question">${problem.answer}</td>
							</tr>
						</c:forEach>
						
					</table>
				</td>
				
			</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>