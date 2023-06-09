<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculator</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%--<form method="post" action="">--%>
<%--    <input type="text" name="number1" placeholder="Input first number" value="${number1}">--%>
<%--    <input type="text" name="number2" placeholder="Input second number" value="${number2}">--%>
<%--    <br><br>--%>
<%--    <button type="submit" name="calculator" value="add">Addition(+)</button>--%>
<%--    <button type="submit" name="calculator" value="sub">Subtraction(-)</button>--%>
<%--    <button type="submit" name="calculator" value="mul">Multiplication(X)</button>--%>
<%--    <button type="submit" name="calculator" value="div">Division(/)</button>--%>
<%--</form>--%>
<%--<p>Result: ${result}</p>--%>

<div class="container">
    <h2>Calculator</h2>
    <form method="post" action="">
        <div class="form-group">
            <label for="num1">Number 1:</label>
            <input type="number" class="form-control" name="number1" id="num1" placeholder="Input first number" value="${number1}">
        </div>
        <div class="form-group">
            <label for="num2">Số thứ hai:</label>
            <input type="number" class="form-control" name="number2" id="num2" placeholder="Input second number" value="${number2}">
        </div>
        <div class="form-group">
            <button type="submit" name="calculator" class="btn btn-default" value="add">Addition(+)</button>
            <button type="submit" name="calculator" class="btn btn-default" value="sub">Subtraction(-)</button>
            <button type="submit" name="calculator" class="btn btn-default" value="mul">Multiplication(X)</button>
            <button type="submit" name="calculator" class="btn btn-default" value="div">Division(/)</button>
        </div>
    </form>
    <h2>Result: ${result}</h2>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>