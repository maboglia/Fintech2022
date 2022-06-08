package view;

import dal.TitoloDAO;
import dal.TitoloDAOImpl;
import model.Tipo;
import model.Titolo;

public class TitoliDemo {

	public static void main(String[] args) {
		
		TitoloDAO repo = new TitoloDAOImpl();
		
		repo.addTitolo(new Titolo(0, "Ferrari",Tipo.AZIONE,100));
		repo.addTitolo(new Titolo(0, "Lamborgini",Tipo.AZIONE,200));
		
		repo
			.getAll()
			.stream()
			.forEach(t -> System.out.println(t));
		
		
		
		
		
	}
	
	
	
}
