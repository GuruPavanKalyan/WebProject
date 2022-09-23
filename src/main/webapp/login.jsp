<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KSP TECH</title>
<link type="text/css" rel ="stylesheet" href="css/style.css">

</head>
<body><div id="Signin">
<marquee direction="right" behavior="alternate" hspace="350px">
<h1 style="">Welcome to KSP Tech</h1><br>
</marquee></div>
<h2>Login Form</h2>

<form action="login" method="get">
  <!--  <div class="imgcontainer">
    <img src=" " alt="Avatar" class="avatar">
  </div>-->

  <div class="container">
    <label for="empId"><b>Employee ID</b></label><br>
    <input type="text" placeholder="Enter Your Employee ID" name="empId" required><br>

    <label for="name"><b>Full Name</b></label><br>
    <input type="text" placeholder="Enter Your Name" name="user" required><br>
    <lable for="pass" style="font-size:100%;" ><b>Password</b>  </lable><br>
<input placeholder="Enter Your Password" class="box" type="password" id="pass" name="pass" ); "><br>
    <div id="current_date"></p>
    <script>
date = new Date();
year = date.getFullYear();
month = date.getMonth() + 1;
day = date.getDate();
document.getElementById("current_date").innerHTML = month + "/" + day + "/" + year;
</script>
    <br>
        
    <button type="submit" value="login">Login</button>
    <!--  <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    <input id="date" name="date" value="javascript:document.write(Date()+'.')"/>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>-->
  </div>
  

  
</form>

</body>
</html>