<html>
	<title>## My App ## Home</title>
	<body>
		<h2>My App</h2>
		<br/>
		
		<img alt="My image 1" src="img/tomcat.png"/>
		
		<br/>	
		<a href="page2.jsp">Page 2</a>	
		<br/>
		<a href="add-contact.html">Register Contact</a>
		<br/>
		<a href="hello">Hello Servlet</a>
		<br/>
		<a href="sum?num1=5&num2=4">Sum 5+4</a>	
		
		<br/><br/>
		
		<%-- comentário em jsp --%>
		<%
			String mensagem = "Welcome Fatima!";			
		%>
		
		<% out.println(mensagem); %>
	
	</body>
</html>
