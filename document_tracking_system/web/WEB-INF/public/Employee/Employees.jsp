<%-- 
    Document   : Employee
    Created on : 13 Aug 2013, 7:48:04 PM
    Author     : 209043946
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome To Employee </title>
    </head>
    <body>
  
<p></p>
<center>
    <table class="table table-hover">
        <caption> <h2>Employees </h2></caption>
        <thead>
            <tr>
                <th>Employee Name</th>
                <th>Employee Surname</th>
                <th>Edit 
                <th>Delete</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employees.fname}</td>
                    <td>${employees.lname} </td>
                    <td><a> Edit </a></td>
                    <td><a> Delete </a></td>
                </tr>

            </c:forEach>

        </tbody>


    </table>

</center>
 
</body>

</html>
