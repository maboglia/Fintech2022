<%@page import="model.Azione"%>
<%@page import="java.util.List"%>

<table>
<%

List<Azione> azioni = (List<Azione>) request.getAttribute("portafoglio");

for (Azione az : azioni) {
	out.print("<tr>");
	out.println("<td>"+az.getNome()+"</td>");
	out.print("</tr>");
}

%>
</table>