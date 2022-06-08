package com.drago;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.drago.entities.Documento;
import com.drago.entities.Viaggio;
import com.drago.repos.DocRepos;
import com.drago.repos.VaiggioRepos;

@SpringBootApplication
public class Prj17ProgrammazioneFunzionaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj17ProgrammazioneFunzionaleApplication.class, args);
	}
	
	public CommandLineRunner prova(DocRepos dr, VaiggioRepos vr) {
		return l->{ 
			Viaggio v = new Viaggio();
			v.setDestinazione("Roma");
			Documento d = new Documento();
			d.setPath("./viaggi/italia/");
			v.setDocumento(d);
			d.setViaggio(v);
			vr.save(v);
		};
	}

}
