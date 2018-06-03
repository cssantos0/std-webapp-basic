<jsp:useBean id="contact" class="com.fvv.std.bean.Contact"/>
<jsp:useBean id="math" class="com.fvv.std.web.bean.MathBean"/>
<html>
<head>
	<title>Home Page</title>
</head>
<body>
	<%@ include file = "header.jsp" %>

	<% 
		contact.setName("Joao");
		
		out.println(math.calculateAverage(100, 150.45)); 
	%>
	
	
	<p>${contact.name}</p>
	
	<%@ include file = "footer.jsp" %>
	
</body>
</html>