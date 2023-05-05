<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 5/4/2023
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Form mail update</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<form:form method="post" action="/save" modelAttribute="email">
    <form:hidden path="id"/>
    <h2>Settings</h2>
    <hr>
    <table class="table table-striped table-inverse table-responsive">
        <tr>
            <td>Language: </td>
            <td>
                <form:select path="language">
                    <form:options items="${languageList}"/>
                </form:select>
            </td>
        </tr>
        <td>Page Size: </td>
        <tr>
            <td>
a                show
                <form:select path="pageSize">
                    <form:options items="${pageSizeList}"/>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td>
            <form:checkbox path="spamsFilter"/>
                Enable spams filter
            </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>
                <form:textarea path="signature" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button>Update</form:button>
            </td>
        </tr>
    </table>
</form:form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
