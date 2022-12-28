package io.github.brujp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configurations e Beans

@Configuration
public class MyConfiguration {

    //Aqui eu configuro a criação do objeto no contexto da aplicação
    // pra utilizar onde eu precisar
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas 2";
    }

}
