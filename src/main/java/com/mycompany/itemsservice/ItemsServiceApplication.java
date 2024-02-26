package com.mycompany.itemsservice;
//pacote ao qual pertence a classe

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//importação de classes do Spring Boot framkework

@SpringBootApplication
//define a classe principal do meu app
public class ItemsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsServiceApplication.class, args);
	}
//metodo main do app é o ponto de entrada para o programa
}
