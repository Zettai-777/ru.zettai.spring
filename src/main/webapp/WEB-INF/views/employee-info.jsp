<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: michel
  Date: 10.02.2021
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee's information</title>
</head>
<body>
<h2>Personal data</h2>
<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id"/>
    <i>Name </i><form:input path="name"/>
    <br><br>
    <i>Surname </i><form:input path="surName"/>
    <br><br>
    <i>Department </i><form:input path="department"/>
    <br><br>
    <i>Salary </i><form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
