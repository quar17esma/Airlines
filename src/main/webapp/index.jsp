<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<jsp:forward page="/controller" >
    <jsp:param name="command" value="SHOW_FLEET"/>
</jsp:forward>
</body>
</html>