<!DOCTYPE html>
<%@page import="model.Dipendente"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Gestionale dipendenti</title>
</head>
<body>

	<h1>Elenco dipendenti</h1>

<table>
  <tr>
    <th>Matr.</th>
    <th>Nome</th>
  </tr>

<% List<Dipendente> dipendenti = (List<Dipendente>) request.getAttribute("elenco"); %>

<% for(Dipendente d : dipendenti) { %>
  
  <tr>
    <td><%= d.getMatricola() %></td>
    <td><%= d.getNome() %></td>
  </tr>
  
<% } %>  
  
  
</table>


</body>
</html>