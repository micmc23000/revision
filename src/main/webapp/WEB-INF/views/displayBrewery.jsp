<%-- 
    Document   : displaybreweryery
    Created on : 9 Mar 2020, 20:19:26
    Author     : Ken
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display</title>
    </head>
    <body>
        <h1>Details for ID: ${brewery.id}</h1>
         <table style="width:100%">
            <tr>
                <th align="left">ID</th>
                <th align="left">Name</th>
                <th align="left">Country</th>
                <th align="left">Phone</th>
                <th align="left">Email</th>
                <th align="left">Latitude</th>
                <th align="left">Longitude</th>
                <th align="left">Last Modified</th>
            </tr>

            <tr>
                <td>${brewery.id} </td>
                <td>${brewery.name}</td>
                <td>${brewery.country}</td>
                <td>${brewery.phone}</td>
                <td>${brewery.email}</td>
                <td>${brewery.latitude}</td>
                <td>${brewery.longitude}</td>
                <td>${brewery.lastMod}</td>
            </tr>

         </table>
             <p><a href="/EAPAssignment/brewery/viewAll">Return to Home Page</a></p>
    </body>
</html>
