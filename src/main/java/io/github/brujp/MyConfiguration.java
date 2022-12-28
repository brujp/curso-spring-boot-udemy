package io.github.brujp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Configurations e Beans

@Configuration
@Profile("development") //Essa configuração será exclusiva para o ambiente de dev.
public class MyConfiguration {

    //Aqui eu configuro a criação do objeto no contexto da aplicação
    // pra utilizar onde eu precisar
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DEV"); //Meu profile está apontando para dev.
        };
    }

}
