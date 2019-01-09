<%--
  Created by IntelliJ IDEA.
  User: Neha
  Date: 8/17/2018
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Login Page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">

    </script>

    <style>

        .marginstyle{
            margin: 50px;
        }
    </style>

</head>
<body>
<div class = "container marginstyle">
    <h2>Enter username and password to Login</h2>
    <form action = "/welcome">
        <div class="form-group">
            <label for ="username">UserName:</label>
            <input type="text" name = "uname" id = "username" placeholder="User Name"
                   class="form-control" style="width: 50%;" required>

        </div>
        <div class = "form-group">
            <label for ="password">Password:</label>
            <input type="password" name = "password" id ="password"
                   class="form-control" placeholder="Password" style="width: 50%;" required>
        </div>

        <input type="submit" value="submit" class="btn btn-primary">

    </form>
</div>
</body>

</body>
</html>
