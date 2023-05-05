<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
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
<h3>Sandwich Condiments</h3>

<form action="/save" method="get">
    <input type="checkbox" name="condiment" value="Lettuce"> Lettuce &nbsp
    <input type="checkbox" name="condiment" value="Tomato"> Tomato &nbsp
    <input type="checkbox" name="condiment" value="Mustard"> Mustard &nbsp
    <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
    <br><hr>
    <button type="submit"> Save </button>
</form>

<h4>Condiments:</h4>
<c:forEach items="${condiment}" var="temp">${temp}<br></c:forEach>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>