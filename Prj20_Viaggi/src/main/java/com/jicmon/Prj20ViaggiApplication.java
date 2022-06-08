package com.jicmon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jicmon.entities.Documento;
import com.jicmon.entities.Viaggio;
import com.jicmon.repos.ViaggioDAO;

@SpringBootApplication
public class Prj20ViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj20ViaggiApplication.class, args);
	}
	@Bean
	public CommandLineRunner command(ViaggioDAO repo) {
		return a-> {
			String[] viaggi= {
					"dal 19/10/2021 al 30/06/2022Soggiorni Termali a Ischia",
					"dal 02/06/2022 al 15/09/2022Soggiorno all’Isola d’Elba",
					"dal 05/06/2022 al 18/09/2022Soggiorno balneare a San Vincenzo Toscana",
					"11/06/2022Montecarlo di Lucca",
					"dal 11/06/2022 al 18/06/2022Meraviglie d´Islanda",
					"dal 14/06/2022 al 21/06/2022Gran tour del Portogallo",
					"dal 16/06/2022 al 19/06/2022OSTIA E CASTELLI ROMANI",
					"dal 17/06/2022 al 19/06/2022La Fioritura delle lenticchie a Castelluccio",
					"dal 18/06/2022 al 25/06/2022Soggiorno balneare a Creta l’isola degli dei - Grecia...",
					"dal 18/06/2022 al 25/06/2022Il cammino di Santiago",
					"dal 19/06/2022 al 23/07/2022Molveno 864 mt – Altopiano della Paganella",
					"dal 19/06/2022 al 27/06/2022Tour della Sicilia con Isole Egadi",
					"dal 19/06/2022 al 20/08/2022Andalo m 1050 Altopiano della Paganella",
					"19/06/2022Montecatini Terme e Pistoia un viaggio nel tempo dal romanico al liberty...",
					"dal 20/06/2022 al 27/06/2022Soggiorno mare in Abruzzo e giornata alle Tremiti...",
					"dal 21/06/2022 al 24/06/2022Bari, Matera e Polignano in volo da Genova...",
					"dal 22/06/2022 al 09/09/2022Soggiorno a S. Antioco Sardegna",
					"dal 22/06/2022 al 10/09/2022Ortisei /Val Gardena mt 1230",
					"dal 22/06/2022 al 10/09/2022Champoluc m 1568 Val D’Ayas",
					"24/06/2022La Reggia di Venaria Reale e il Parco La Mandria...",
					"dal 24/06/2022 al 11/09/2022Vermiglio /Passo del Tonale mt 1260",
					"dal 24/06/2022 al 11/09/2022Cogolo di Pejo– HOTEL ORTLES",
					"dal 25/06/2022 al 26/06/2022Viaggio in barca sul lago sotterraneo di Saint Léonard...",
					"26/06/2022La Cappella Sistina delle Alpi Marittime",
					"dal 29/06/2022 al 04/09/2022Levico Terme m 530 Valsugana"
					
					
					
			};
			for (String string : viaggi) {
				Viaggio v= new Viaggio();
			v.setDestinazione(string);
			Documento d= new Documento();
			d.setPercorso("locandina.pdf");
			v.setDocumento(d);
			d.setViaggio(v);
			repo.save(v);
				
			}
			
			
		};
	}

}
