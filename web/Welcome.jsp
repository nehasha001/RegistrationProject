<%--
  Created by IntelliJ IDEA.
  User: Neha
  Date: 8/12/2018
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <title>Welcome Neha</title>

    <style>
        .marginstyle{
            margin: 50px;
        }
    </style>
</head>
<body>
<%
    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("Welcome.jsp");
    }
%>
<div class = "jumbotron jumbotron-fluid">
    <div class="container text-center">
        <h1> Welcome </h1> <br>
        <form action="Register.jsp">
            <div class = "form-group">
                <input type="submit"  value="logout">
            </div>
        </form>
    </div>
</div>
</body>




