<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="language" value="${pageContext.response.locale}"
	scope="request" />

<!DOCTYPE html>
<html lang="${language}">
<head>
<title>Tiles+Spring Example</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="<s:url context="/" value="/css/bootstrap.min.css" />" />
<script src="<s:url context="/" value="/js/bootstrap.min.js" />"></script>
<script src="<s:url context="/" value="/js/jquery.min.js" />"></script>
<style>
body {
	background-color: #f0f0f0;
}

#content {
	padding: 10px;
}

.spittles {
	font-size: 16px;
}

footer {
	background-color: #555555;
	color: #e0e0e0;
	padding: 15px;
}

footer a {
	color: #9d9d9d;
}

footer a:hover {
	color: #444444
}
</style>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="content">
		<tiles:insertAttribute name="body" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>