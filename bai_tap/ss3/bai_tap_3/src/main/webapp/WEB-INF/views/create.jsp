<%--
  Created by IntelliJ IDEA.
  User: anhda
  Date: 5/2/2023
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<h3>Create Product</h3>

<a th:href="@{/}">Back to product list</a>

<form action="/save" method="post" th:object="${product}">
    <table>

        <tr>
            <td>Id:</td>
            <td><input type="number" th:field="*{id}"/></td>
        </tr>

        <tr>
            <td>Name:</td>
            <td><input type="text" th:field="*{name}"/></td>
        </tr>

        <tr>
            <td>Price:</td>
            <td><input type="number" th:field="*{price}"/></td>
        </tr>

        <tr>
            <td>Describe:</td>
            <td><input type="text" th:field="*{describe}"/></td>
        </tr>

        <tr>
            <td>Producer:</td>
            <td><input type="text" th:field="*{producer}"/></td>
        </tr>

    </table>

    <button type="submit">Save</button>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
