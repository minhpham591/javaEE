<%-- 
    Document   : search
    Created on : Apr 29, 2019, 9:41:03 AM
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
        <title>SEARCH MESSENGER BETA</title>
         <% ArrayList<mess> messs = 
            (ArrayList<mess>) request.getAttribute("data"); %>
    </head>
    <body>
        <div class="wrap">
   <div class="search">
      <form method="POST" action="search">
          <input type="text" class="searchTerm" placeholder="Username"></br>
          <input type="date" class="searchTerm" placeholder="From"></br>
          <input type="date" class="searchTerm" placeholder="To"></br>
      <button type="submit" class="searchButton">SEARCH
      </button>
      </form>
       <section> 
        <h1>SEARCH</h1>
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
         <a href="../view/all">GO CHAT</a>
        <form method="POST" action="logout">
            <button> LOGOUT</button>
        </form>
        </section>
   </div>
</div>
    </body>
</html>
