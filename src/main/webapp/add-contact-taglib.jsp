<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="cirao" %>

<html>
	<head>
		<!-- prefer to use local imports for JS and CSS files instead of URLs -->
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  	    <link rel="stylesheet" href="/resources/demos/style.css">
  		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	</head>
<body>
	<c:import url="header.jsp" />
	<br/><br/>
	
	
	
	<form action="addContact" method="post" id="formAddContact">
		<p>Name: <input type="text" name="name" /></p>
		<p>E-mail: <input type="text" name="email" /> </p>
		<p>Address: <input type="text" name="address" /></p> 
		<p>Date of Birth: <cirao:dateField id="dateOfBirth" /></p>
		<p>Date of Birth2: <cirao:dateField id="dateOfBirth2" /></p>
		<p>Date of Birth3: <cirao:dateField id="dateOfBirth3" /></p>
		<input type="submit" value="Record" />
	</form>
	
	<br/>
	<c:import url="footer.jsp" />
</body>
</html>