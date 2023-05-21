<!DOCTYPE html>
<html>
<head>
    <title>BuyCar</title>
</head>
<body>
<h2>BuyCar</h2>
<hr>
<#list cars as car>
    <p><b>${car.brand}</b> | ${car.model} | ${car.price} ₽ </p>
    </#list>
    <hr>
    <h4>Добавить новый Авто</h4>
<form action="/create" method="post">
    Бренд:  <input type="text" name="brand"/><br><br>
    Модель: <input type="text" name="model"/><br><br>
    Цена:   <input type="number" name="price"/><br><br>
    <button type="submit">Создать</button>
</form>
</body>
</html>