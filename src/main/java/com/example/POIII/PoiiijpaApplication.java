package com.example.POIII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.example.POIII")
@EnableJpaRepositories("com.example.POIII.repository")
@EntityScan("com.example.POIII.model")
@SpringBootApplication
public class PoiiijpaApplication {

	/*  Para criação da tabela no SQL
	CREATE TABLE Disciplina (
    id INT AUTO_INCREMENT PRIMARY KEY,
    professor VARCHAR(255) NOT NULL,
    turma INT NOT NULL,
    sala INT NOT NULL,
    horario VARCHAR(5) NOT NULL
	);
	 */


	public static void main(String[] args) {
		SpringApplication.run(PoiiijpaApplication.class, args);
	}
}