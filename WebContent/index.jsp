<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value= "PUT"/>
    <input type="submit" value="testRestPut"/>
</form><br/><br/>
 
<form action="springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="TestRest DELETE"/>
</form><br><br>
 
<form action="springmvc/testRest" method="post">
    <input type="submit" value="testRestPost">
</form><br/><br/>
 
<a href="springmvc/testRest/1">testRest</a><br/><br/>

<a href="helloworld">hello world</a>

<a href="springmvc/testPathVariable/1">testPathVariable</a><br/><br/>

</body> 
</html>