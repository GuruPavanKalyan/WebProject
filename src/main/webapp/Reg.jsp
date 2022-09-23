<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KSP </title>
<link type="text/css" rel ="stylesheet" href="css/style.css">

</head>
<body>
<body><div id="welcome">
<marquee direction="right" behavior="alternate" hspace="350px">
<h1>Welcome to KSP Tech</h1><br>
</marquee></div>
<h2>Registration Form</h2>

<form action="reg" method="post">
  <!--  <div class="imgcontainer">
    <img src=" " alt="Avatar" class="avatar">
  </div>-->

  <div class="container">
<!--  <label for="empId"><b>Employee ID</b></label><br>
    <input type="text" placeholder="Enter Your Employee ID" name="empId" required><br>-->
<lable for="user" style="font-size:100%;" ><b>User Name</b></lable><br>
<input placeholder="Enter User Name" class="box" type="text" id="user" name="user" " ><br>
<lable for="pass" style="font-size:100%;" ><b>Password</b></lable><br>
<input  placeholder="Enter your password" class="box" type="password" id="pass" name="pass"  "><br>
<lable for="email" style="font-size:100%;" ><b>Email</b></lable><br>
<input placeholder="Enter your Email"class="box" type="email" id="email" name="email"  "><br><br>
<input type="submit" value="Sign up" ><br>
<input type="checkbox" id="check">
<lable class="tex"  for="check" style="color:blue;">Remember me</lable><br>
    
    </div></form>
</body>
</html>