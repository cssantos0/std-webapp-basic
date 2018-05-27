<%@page import="com.fvv.std.bean.Contact"%>
<%@page import="java.util.List"%>
<%@page import="com.fvv.std.controller.ContactControllerImpl"%>
<%@page import="com.fvv.std.controller.ContactController"%>

<html>
	<body>
		<table border="1">
			<tr>
				<td><b>Name</b></td>
				<td><b>Email</b></td>
				<td><b>Address</b></td>
			</tr>

			<%
				ContactController controller = new ContactControllerImpl();
				List<Contact> contacts = controller.listContacts();
				for (Contact contact : contacts) {
			%>
				<tr>
					<td><%=contact.getName()%></td>
					<td><%=contact.getEmail()%></td>
					<td><%=contact.getAddress()%></td>
				</tr>
			<%
				}
			%>
		</table>
	</body>
</html>