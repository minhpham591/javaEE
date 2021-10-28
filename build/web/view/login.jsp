<%-- 
    Document   : login
    Created on : Apr 28, 2019, 5:58:09 PM
    Author     : phamm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/CSS.css">
        <title>LOGIN MESSENGER BETA</title>
    </head>
    <body>
        <div class="login-page">
            <h1>LOGIN</h1>
    <div class="form">
    <form method="POST" action="login">
        <input type="text" placeholder="username" name="username"/>
      <input type="password" placeholder="password" name="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
    </body>
</html>
