<%--
  Created by IntelliJ IDEA.
  User: Neha
  Date: 8/12/2018
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>

        body {
            background-color: White;

        }

        h1 {
            color:Violet;
            margin-left: 120px;
        }
        div.a {
            text-align: center;
        }
        div {
            animation: mymove 5s infinite;
        }
    </style>
</head>
<h1>
    Hi there,Welcome to Registration page!!
</h1>
<body>
<form action="Register" method="post">
Enter First Name:<input type="text"name="first name"> <br/>
Enter Last Name: <input type="text"name="last name"> <br/>
Enter Gender : <input name="gender">
<input type="radio" value="gender" value="male"> Male
<input type="radio" value="gender" value="female"> Female
<input type="radio" value="gender" value="Others"> Others <br>
Enter Email : <input type="text"name="email"> <br>
Enter username : <input type="text"name="username"> <br/>
Enter password : <input type="text"name="password"> <br/>
<input type="submit"value="Register">
</form>

</body>
</html>
