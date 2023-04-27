<%--<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="/usd" method="post">--%>
<%--    <label>Rate: </label>--%>
<%--    <input type="text" name="rate" placeholder="Rate" value="23000"><br>--%>
<%--    <label>USD: </label>--%>
<%--    <input type="text" name="usd" placeholder="USD" value="0"><br>--%>
<%--    <input type="submit" id="submit" value="Converter">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
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

<form action="/usd" method="post">
    <div class="input-group">
        <label>RATE: </label>
        <input type="text" class="form-control" name="rate" aria-describedby="helpId" placeholder="Rate" value="23000">
        <label>USD</label>
        <input type="text" name="usd" class="form-control" aria-describedby="helpId" placeholder="USD" value="0">
        <input type="submit" id="submit" value="Converter">
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>