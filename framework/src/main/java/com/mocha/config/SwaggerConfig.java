package com.mocha.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/6.
 */
@Configurable
@EnableSwagger2
public class SwaggerConfig {


//    @Bean
//    public Docket addUserDocket() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//        ApiInfo apiInfo = new ApiInfo(
//                "Spring boot swagger Document API",
//                "API Document管理",
//                "V1.0.0",
//                "",
//                "1239917467@qq.com",
//                "",
//                "");
//        docket.apiInfo(apiInfo).select()
//                .apis(RequestHandlerSelectors.basePackage("com.mocha"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mocha.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("description")
                .termsOfServiceUrl("http://localhost:8080/")
                //.contact("Leo")
                .version("1.0")
                .build();
    }

}
