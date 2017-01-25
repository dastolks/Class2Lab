<%-- 
    Document   : PageGenerator2
    Created on : Jan 25, 2017, 12:41:11 PM
    Author     : aschindler1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <%
                for(int i=0; i<3;i++){
            %>
            <tr>
                <%
                    for(int j=0; j<3;j++){
                %>
                <td>
                    <%
                        for(int k=0; k < 3; k++){
                            out.println("Check on this at " + k + " and " + j + " and " + i +"!");
                        }                     
                    %>
                </td>
                <%
                  }  
                %>
            </tr>
            <%
                }  
            %>
        </table>
    </body>
</html>
