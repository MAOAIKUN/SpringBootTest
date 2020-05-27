package com.mak.sbt.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author MaoAiKun
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(@Qualifier("apiInfo") ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo);
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfo("换行符的项目的API文档", "这是一个测试项目", "1.0", "urn:tos", new Contact("MAK", "localhost:8080", "2570924910@qq.com"), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }

}
