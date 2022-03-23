<%@page import="model.Animale"%>
<%@page import="controller.ZoomCtrl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td {padding: 5px; border:1px solid gray;}

</style>
</head>
<body>

<% ZoomCtrl ctrl = new ZoomCtrl(); %>

<%  ctrl.addAnimale(new Animale("lemure", "isola1")); %>
<%  ctrl.addAnimale(new Animale("tigre", "isola2")); %>
<%  ctrl.addAnimale(new Animale("pinguino", "isola3")); %>
<%  ctrl.addAnimale(new Animale("giraffa", "isola3")); %>
<table>
<% for(Animale a: ctrl.getAnimali()){ %>

	<tr><td><%= a.getNome() %></td></tr>

<% } %>

</table>
</body>
</html>