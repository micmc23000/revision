<%-- 
    Document   : qrDisplay
    Created on : 27 Apr 2020, 19:20:11
    Author     : Ken
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Website = ${website}</h1>
        <img src="data:image/jpg;base64, ${b64}" alt="websiteQR">
    </body>
</html>
