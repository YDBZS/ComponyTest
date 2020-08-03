package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket config(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(info())
                .select().apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.any())
                .build();
    }


    public ApiInfo info(){
        return new ApiInfoBuilder()
                .title("测试接口文档")
                .contact(new Contact("axel","localhost:8099",null))
                .description("测试文件上传接口")
                .version("v1.0")
                .termsOfServiceUrl("10.118.37.69:8099")
                .build();
    }





}
