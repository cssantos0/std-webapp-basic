<jsp:useBean id="contactView" class="com.fvv.std.web.view.ContactView"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
<head>
	<title>Home Page</title>
	
	<link rel="stylesheet" href="css/displaytag.css" type="text/css">
	<link rel="stylesheet" href="css/screen.css" type="text/css">
	<link rel="stylesheet" href="css/site.css" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	
	<display:table name="${contactView.contacts}" />
	
	<br/>
	
	<%@ include file = "footer.jsp" %>
	
</body>
</html>