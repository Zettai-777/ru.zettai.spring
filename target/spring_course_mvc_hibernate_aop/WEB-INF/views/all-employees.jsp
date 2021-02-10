<%--
  Created by IntelliJ IDEA.
  User: michel
  Date: 10.02.2021
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>Employee's list</title>
</head>
<body>
    <h2>TEAM DREAM</h2>
    <table>
        <tr>
            <th><i>ID</i></th>
            <th><i>NAME</i></th>
            <th><i>SURNAME</i></th>
            <th><i>DEPARTMENT</i></th>
            <th><i>SALARY</i></th>
            <th><i>OPERATIONS</i></th>
        </tr>
        <c:forEach var="employee" items="${allEmps}">

            <c:url var="updateButton" value="updateInfo">
                <c:param name="empId" value="${employee.id}"/>
            </c:url>

            <c:url var="deleteButton" value="deleteEmployee">
                <c:param name="empId" value="${employee.id}"/>
            </c:url>

            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.surName}</td>
                <td>${employee.department}</td>
                <td>${employee.salary}</td>
                <td>
                    <input type="button" value="UPDATE"
                    onclick="window.location.href='${updateButton}'"/>

                    <input type="button" value="DELETE"
                    onclick="window.location.href='${deleteButton}'"/>
                </td>

            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="button" value="Add new employee"
    onclick="window.location.href='addNewEmployee'">
</body>
</html>
