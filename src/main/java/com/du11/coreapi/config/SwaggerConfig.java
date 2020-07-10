package com.du11.coreapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiEndPointsInfo())
                .globalOperationParameters(Collections.singletonList(
                    new ParameterBuilder()
                    .name("Authorization")
                    .description("Bearer your_token")
                    .modelRef(new ModelRef("string"))
                    .parameterType("header")
                    .required(false)
                    .defaultValue("Bearer")
                    .build()
                ))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.du11.coreapi.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder()
                .title("SR Allocation Management REST API")
                .description("Document with Swagger 2")
                .license("Samsung SDS")
                .licenseUrl("")
                .version("1.0")
                .build();
    }

}
