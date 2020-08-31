<%@page import="java.net.URI"%>
<%@page import="java.io.File"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><spring:message code="allBreweries.title"/></title>
        
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="http://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
        <script src="http://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function()
            {
                $('#displayAll').DataTable();
            });
        </script>
    </head>
    <body>
        <h1>All Breweries</h1>
        <table id="displayAll" class="display" style="width:100%">
            <thead>
            <tr>
                <th align="left"><spring:message code="label.id"/></th>
                <th align="left"><spring:message code="label.name"/></th>
                <th align="left"><spring:message code="label.address1"/></th>
                <th align="left"><spring:message code="label.address2"/></th>
                <th align="left"><spring:message code="label.city"/></th>
                <th align="left"><spring:message code="label.state"/></th>
                <th align="left"><spring:message code="label.code"/></th>
                <th align="left"><spring:message code="label.country"/></th>
                <th align="left"><spring:message code="label.phone"/></th>
                <th align="left"><spring:message code="label.website"/></th>
                <th align="left"><spring:message code="label.image"/></th>
                <th align="left"><spring:message code="label.description"/></th>
                <th align="left"><spring:message code="label.addUser"/></th>
                <th align="left"><spring:message code="label.lastMod"/></th>
                <th align="left"><spring:message code="label.creditLimit"/></th>
                <th align="left"><spring:message code="label.email"/></th>
                <th align="left"><spring:message code="label.longitude"/></th>
                <th align="left"><spring:message code="label.latitude"/></th>
                <th align="left"><spring:message code="label.actions"/></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${breweryList}" var="brewery">
                <tr>
                    <td>${brewery.id}</td>
                    <td>${brewery.name}</td>
                    <td>${brewery.address1}</td>
                    <td>${brewery.address2}</td>
                    <td>${brewery.city}</td>
                    <td>${brewery.state}</td>
                    <td>${brewery.code}</td>
                    <td>${brewery.country}</td>
                    <td>${brewery.phone}</td>
                    <td>${brewery.website}</td>
                    <td><img alt="Image"  src="<c:url value="assets/images/${brewery.image}"/>"></td>                    
                    <td>${brewery.description}</td>
                    <td>${brewery.addUser}</td>
                    <td>${brewery.lastMod}"></td>
                    <td>${brewery.creditLimit}</td>
                    <td>${brewery.email}</td>
                    <td>${brewery.longitude}</td>
                    <td>${brewery.latitude}</td>
                    <td>
                        <a href="/EAPAssignment/brewery/display?id=${brewery.id}"><spring:message code="label.display"/></a>
                        <a href="/EAPAssignment/brewery/delete?id=${brewery.id}" onclick="return confirm('Are you sure?')"><spring:message code="label.delete"/></a>
                        
                        <a href="/EAPAssignment/brewery/edit?id=${brewery.id}"><spring:message code="label.edit"/></a>
                        
                        <a href="/EAPAssignment/brewery/add"><spring:message code="label.insert"/></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>
