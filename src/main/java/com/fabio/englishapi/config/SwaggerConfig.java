package com.fabio.englishapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //http://localhost:8080/swagger-ui/
    //https://english-api-lp.herokuapp.com/swagger-ui/

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fabio.englishapi"))
                .build()
                .apiInfo(metaData());

    }

    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Spring Boot - English REST API")
                .description("API to study english")
                .version("1.0.0")
                .build();
    }

}













