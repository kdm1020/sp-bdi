<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=utf-8" session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<ul>
	<c:forEach var="strList" items="${strList}">
	
	<li>${strList}</li>
	</c:forEach>
	</ul>
	

	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
