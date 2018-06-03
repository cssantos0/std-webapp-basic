<jsp:useBean id="contactView" class="com.fvv.std.web.view.ContactView"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
<head>
	<title>Home Page</title>
	
	<link rel="stylesheet" href="css/displaytag.css" type="text/css">
	<link rel="stylesheet" href="css/site.css" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	
	<display:table name="${contactView.contacts}" 
				   decorator="com.fvv.std.web.displaytag.wrapper.ContactWrapper">
		<display:column property="name" title="Name" />
		<display:column property="email" title="Email" />
		<display:column property="address" title="Address" />
		<display:column property="birthDate" title="Birth Date" />
	</display:table>
	
	<br/>
	
	<%@ include file = "footer.jsp" %>
	
</body>
</html>