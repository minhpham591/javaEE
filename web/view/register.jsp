<%-- 
    Document   : register
    Created on : Apr 28, 2019, 7:29:15 PM
    Author     : phamm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/CSS.css">
        <title>REGISTER MESSENGER BETA</title>
    </head>
    <body>
        <div class="login-page">
            <h1>REGISTER</h1>
    <div class="form">
    <form method="POST" action="register">
      <input type="text" placeholder="username" name="username"/>
      <input type="password" placeholder="password" name="password"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    </div>
        </div>
    </body>
</html>
