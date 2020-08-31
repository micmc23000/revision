<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit a Brewery</title>
    </head>
    <body>
        <h1>Edit a Brewery</h1>
        <jsp:useBean id="date" class="java.util.Date" />
        
        Time modified: <fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss" />
        <form:form method="POST" action="/EAPAssignment/brewery/editBrewery" modelAttribute="brewery">
            <table>
                <span style="color:red;">
                    <form:errors path="*"/>
                </span>
                 <tr>
                    <td><form:label path="id"><spring:message code="label.id"/></form:label></td>
                    <td><form:input path="id" readonly="true"/></td>
                </tr>   
                <tr>
                    <td><form:label path="name"><spring:message code="label.name"/></form:label></td>
                    <td><form:input path="name"/></td>
                    <td style="color:red"><form:errors path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="address1"><spring:message code="label.address1"/></form:label></td>
                    <td><form:input path="address1"/></td>
                    <td style="color:red"><form:errors path="address1"/></td>
                </tr>
                <tr>
                    <td><form:label path="address2"><spring:message code="label.address2"/></form:label></td>
                    <td><form:input path="address2"/></td>
                    <td style="color:red"><form:errors path="address2"/></td>
                </tr>
                <tr>
                    <td><form:label path="city"><spring:message code="label.city"/></form:label></td>
                    <td><form:input path="city"/></td>
                    <td style="color:red"><form:errors path="city"/></td>
                </tr>
                <tr>
                    <td><form:label path="state"><spring:message code="label.state"/></form:label></td>
                    <td><form:input path="state"/></td>
                    <td style="color:red"><form:errors path="state"/></td>
                </tr>
                <tr>
                    <td><form:label path="code"><spring:message code="label.code"/></form:label></td>
                    <td><form:input path="code"/></td>
                    <td style="color:red"><form:errors path="code"/></td>
                </tr>
                <tr>
                    <td><form:label path="country"><spring:message code="label.country"/></form:label></td>
                    <td><form:input path="country"/></td>
                    <td style="color:red;"> <form:errors path="country"/></td>
                </tr>
                <tr>
                    <td><form:label path="phone"><spring:message code="label.phone"/></form:label></td>
                    <td><form:input path="phone"/></td>
                    <td style="color:red;"> <form:errors path="phone"/></td>
                </tr>
                <tr>
                    <td><form:label path="website"><spring:message code="label.website"/></form:label></td>
                    <td><form:input path="website"/></td>
                    <td style="color:red"><form:errors path="website"/></td>
                </tr>
                <tr>
                    <td><form:label path="description"><spring:message code="label.description"/></form:label></td>
                    <td><form:input path="description"/></td>
                    <td style="color:red;"> <form:errors path="description"/></td>
                </tr>
                <tr>
                    <td><form:label path="creditLimit"><spring:message code="label.creditLimit"/></form:label></td>
                    <td><form:input path="creditLimit"/></td>
                    <td style="color:red"><form:errors path="creditLimit"/></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
                    <td><form:input path="email"/></td>
                    <td style="color:red"><form:errors path="email"/></td>
                </tr>
                    <form:input type="hidden" path="lastMod" value="${date}" />
                    <form:input type="hidden" path="image" value="no_image"/>
                <tr>
                    <td><form:label path="latitude"><spring:message code="label.latitude"/></form:label></td>
                    <td><form:input path="latitude"/></td>
                    <td style="color:red"><form:errors path="latitude"/></td>
                </tr>     
                <tr>
                    <td><form:label path="longitude"><spring:message code="label.longitude"/></form:label></td>
                    <td><form:input path="longitude"/></td>
                    <td style="color:red"><form:errors path="longitude"/></td>
                </tr>
                        
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table> 
        </form:form>
        <p><a href="/EAPAssignment/brewery/viewAll">Return to Home Page</a></p>
    </body>
</html>
