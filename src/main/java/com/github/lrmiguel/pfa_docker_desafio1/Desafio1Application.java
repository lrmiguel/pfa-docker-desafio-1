package com.github.lrmiguel.pfa_docker_desafio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.github.lrmiguel.pfa_docker_desafio1.infra.repository")
public class Desafio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);
    }

}
