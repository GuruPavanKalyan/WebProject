<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel ="stylesheet" href="css/style.css">
<style>

li{
float:left;
}
li a{
display:block;
color:white;
text-align:center;
padding:16px;
text-decoration:none;
}
li a:hover{
background-color:red;
}
ul{
list-style-type:none;
padding:0;
margin:0;
overflow:hidden;
background-color:#333333;
}.logo{
text-align:left;}

</style>
</head>
<body>
<h1 style="text-align:center;color:#90EE90;"><strong>Welcome <span><%=session.getAttribute("user") %></span></strong></h1>
<form action="logout" method="get">
<input type="submit" value="logout">
</form>


</body>
</html>