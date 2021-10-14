package com.reto3.Reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecuriryAutoConfiguration;

@SpringBootApplication(exclude ={SecurityAutoConfiguration.class })
public class Reto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

}

//Orthesis
//Marca varchar(45)
//Nombre varhcar(45)
//Año integer (4)
//Descripcion varchar(250)
//Categoria llave foranea de la tabla category
//-------------------------------
//Categoria
//Nombre varchar(45)
//Descripcion varhcar(250)
//------------------------
//Mensajes
//Orthesis llave foranea de la tabla orthesis
//texto varhcar(250)
//-------------------------------
//Reservas
//Orthesis llave foranea de la tabla orthesis
//Cliente llave foranea de la tabla client
//FechaInicio date con hora
//FechaEntrega date con hora