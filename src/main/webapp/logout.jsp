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

<h2><center>KSP Tech</center></h2>
<h1 style="text-align:center;color:#90EE90;"><strong><span>
<%=session.getAttribute("user") %>
</span> You are Successfully logout. </strong></h1>
<h1><a href="http://localhost:8081/Registration_task/login.jsp" ><center>Login Again</center></a></h1><br>
<h2><center>Thank You</center></h2>


</body>
</html>