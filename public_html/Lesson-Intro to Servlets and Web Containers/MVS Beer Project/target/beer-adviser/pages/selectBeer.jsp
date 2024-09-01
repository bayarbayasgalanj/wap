<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Selection Advice</title>
</head>
<body>
<h2>Select Beer Color</h2>
<form action="../selectBeer" method="post">
    <label for="color">Pick a beer color:</label>
    <select name="color" id="color">
        <option value="light">Light</option>
        <option value="amber">Amber</option>
        <option value="brown">Brown</option>
        <option value="dark">Dark</option>
    </select>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
