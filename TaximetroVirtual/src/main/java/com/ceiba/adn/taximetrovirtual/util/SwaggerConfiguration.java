package com.ceiba.adn.taximetrovirtual.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase encargada de la configuraciond de Swagger
 * @author diego.avila
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	public Docket documentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //las peticiones que se van a manejar son las de las clase que tienen
                //la clase RestController
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                //busque todo los elementos que tengan esa anotacion
                .paths(PathSelectors.any())
                .build();
    }
}
