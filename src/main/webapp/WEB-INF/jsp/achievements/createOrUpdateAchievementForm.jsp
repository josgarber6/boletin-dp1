<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="achievements">
<title>Achievement</title>
</head>
<body>
	<h2>Achievement</h2>
	<mvc:form modelAttribute="achievement">
		<table>
			<tr>
				<td><mvc:label path="name">Name:</mvc:label></td>
				<td><mvc:input path="name"/></td>
			</tr>
			<tr>
				<td><mvc:label path="description">Description:</mvc:label></td>
				<td><mvc:input path="description" /></td>
			</tr>
			<tr>
				<td><mvc:label path="badgeImage">Badge:</mvc:label></td>
				<td><mvc:input path="badgeImage" /></td>
			</tr>
			<tr>
				<td><mvc:label path="threshold">Threshold:</mvc:label></td>
				<td><mvc:input path="threshold" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</mvc:form>

</body>
</petclinic:layout>