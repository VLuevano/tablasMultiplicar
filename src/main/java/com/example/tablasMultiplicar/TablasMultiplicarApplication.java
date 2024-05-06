package com.example.tablasMultiplicar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TablasMultiplicarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TablasMultiplicarApplication.class, args);

		Tablas tablas = new Tablas();

		tablas.mostarUnaTabla(1);
		tablas.mostarVariasTablas(5);
		//tablas.mostrarMenu();
	}
}
