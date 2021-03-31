package br.com.ubs.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "br.com.ubs")
public class TesteUbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteUbsApplication.class, args);
    }

}
