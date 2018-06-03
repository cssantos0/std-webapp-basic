<jsp:useBean id="contactView" class="com.fvv.std.web.view.ContactView"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
	<title>Home Page</title>
</head>
<body>
	<%@ include file = "header.jsp" %>

	<table border="1">
		<tr>
			<td><b>#</b></td>
			<td><b>Name</b></td>
			<td><b>Email</b></td>
			<td><b>Address</b></td>
			<td><b>DoB</b></td>
		</tr>
		<c:forEach var="contact" items="${contactView.contacts}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }" >
				<td>${id.count}</td>
				<td>${contact.name}</td>
				<td>
					<c:choose>
						<c:when test="${not empty contact.email}">
							<a href="mailto:${contact.email}">${contact.email}</a>
						</c:when>
						<c:otherwise>
							Mail not found
						</c:otherwise>
					</c:choose>
				</td>
				<td>${contact.address}</td>
				<td>
					<fmt:formatDate value="${contact.birthDate.time}" pattern="dd/MM/yyyy" />
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	
	<%@ include file = "footer.jsp" %>
	
</body>
</html>