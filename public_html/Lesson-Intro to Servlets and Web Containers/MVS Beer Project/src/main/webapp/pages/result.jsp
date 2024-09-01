<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Recommendations</title>
</head>
<body>
<h2>Beer Recommendations</h2>
<ul>
    <!-- Retrieve and display beer styles from the request attribute -->
    <c:forEach var="style" items="${styles}">
        <li>${style}</li>
    </c:forEach>
</ul>
<a href="pages/selectBeer.jsp">Back to selection</a>
</body>
</html>
