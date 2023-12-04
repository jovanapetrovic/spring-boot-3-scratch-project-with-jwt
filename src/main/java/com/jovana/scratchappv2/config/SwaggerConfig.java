package com.jovana.scratchappv2.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by jovana on 04.12.2023
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenApi() {
        Contact contact = new Contact();
        contact.setEmail("jovana.petrovic.it@gmail.com");
        contact.setName("Jovana Petrovic");
        contact.setUrl("https://github.com/jovanapetrovic");

        Info info = new Info()
                .title("ScratchApp V2")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints for ScratchApp V2 (Java 17 + Spring 3).");

        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearerAuth",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .security(List.of(new SecurityRequirement().addList("bearerAuth")))
                .info(info);
    }

}
