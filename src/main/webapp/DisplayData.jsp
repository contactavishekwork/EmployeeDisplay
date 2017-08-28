<%-- 
    Document   : DisplayData
    Created on : Aug 27, 2017, 4:03:59 PM
    Author     : Avishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Data</title>
    </head>
    <body>
        <h1>Employee Data:</h1>
        <p>
        <table>
            <tr>
                <td>Employee ID: </td>
                <td>${requestScope.response.Employee.getEmpID()}</td>
            </tr>
            <tr>
                <td>Department ID: </td>
                <td>${requestScope.response.Employee.getDeptID()}</td>
            </tr>
            <tr>
                <td>Employee Name: </td>
                <td>${requestScope.response.Employee.getName()}</td>
            </tr>
            <tr>
                <td>Employee Salary: </td>
                <td>${requestScope.response.Employee.getSalary()}</td>
            </tr>
        </table>
        </p>
        <h1>Department Data: </h1>
        <p>
        <table>
            <tr>
                <td>Department ID: </td>
                <td>${requestScope.response.Department.getDeptID()}</td>
            </tr>
            <tr>
                <td>Department Name: </td>
                <td>${requestScope.response.Department.getDeptName()}</td>
            </tr>
            <tr>
                <td>Department Supervisor: </td>
                <td>${requestScope.response.Department.getDeptSupervisor()}</td>
            </tr>
        </table>
        </p>
    </body>
</html>
