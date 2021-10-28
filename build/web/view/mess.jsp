<%-- 
    Document   : mess
    Created on : Apr 28, 2019, 8:57:54 PM
    Author     : phamm
--%>

<%@page import="model.mess"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/CSS.css">
        <title>MESSENGER BETA</title>
        <% ArrayList<mess> messs = 
            (ArrayList<mess>) request.getAttribute("data"); %>
    </head>
    <body>
        <section> 
        <h1>CHAT</h1>
        <div class="tbl-header" >
            <table cellpadding="0" cellspacing="0" border="0">
            <tr>
                <th>USERNAME</th>
                <th>MESSENGER</th>
                <th>TIME</th>
            </tr>
            </table>
        </div>
        <div class="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <%for(mess h : messs) {%>
            <tr>
                <td><%=h.getUsername()%></td>
                <td><%=h.getMess()%></td>
                <td><%=h.getDate()%> &nbsp; <%=h.getTime()%> </td>
            </tr>
            <%}%>
        </table> 
        </div>
        <div class="container">
            <div class="form-wrap">
                <form method="POST" action="all"> 
                      <input type="text" placeholder="TEXT HERE" name="mess"/>
                      <button hidden="SEND"></button>           
                </form>
            </div>
        </div>
        <a href="../view/search">VIEW HISTORY</a>
        <form method="POST" action="logout">
            <button> LOGOUT</button>
        </form>
        </section>    
    </body>
</html>
