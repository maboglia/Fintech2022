<%
	GestionePortafoglio gp; 
	
	if (session.getAttribute("portafoglio")!=null){
		gp = (GestionePortafoglio) session.getAttribute("portafoglio");
	}else {
		gp = new GestionePortafoglio(
			new Portafoglio("Portafoglio sig.rossi")	);
		session.setAttribute("portafoglio", gp);
	}
	
	
	
	if (request.getParameter("codice") != null){
		
		int codice = Integer.parseInt( request.getParameter("codice") );
		int quotazione = Integer.parseInt( request.getParameter("quotazione") );
		String nome = request.getParameter("nome");
		Azione a = new Azione();
		a.setCodice(codice);
		a.setNome(nome);
		a.setQuotazione(quotazione);
		a.setSettore(Settore.TECH);
		
		gp.addAzione(a);
		session.setAttribute("portafoglio", gp);
	}
	
	
	
	
	
	
	
	%>