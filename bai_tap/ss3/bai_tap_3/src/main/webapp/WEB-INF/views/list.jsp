<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<h2>Product list</h2>

<a th:href="@{/create}">Add new product</a>

<form action="/search" method="get">
    <input type="text" name="name">
    <button type="submit">Search</button>
</form>

<p style="color: green" th:text="${mess}"></p>

<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Describe</th>
        <th>Producer</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View</th>
    </tr>

    <tr th:each="product : ${products}">
        <td th:text="${product.id}"></td>
        <td th:text="${product.name}"></td>
        <td th:text="${product.price}"></td>
        <td th:text="${product.describe}"></td>
        <td th:text="${product.producer}"></td>
        <td><a th:href="@{/edit/__${product.id}__}">edit</a></td>
        <td><a th:href="@{/delete/__${product.id}__}">delete</a></td>
        <td><a th:href="@{/view/__${product.id}__}">view</a></td>
    </tr>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>