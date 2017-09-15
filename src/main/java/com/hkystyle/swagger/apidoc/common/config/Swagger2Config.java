/**
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.hkystyle.swagger.apidoc.common.config;

/**
 * Created by hukaiyang on 2017/9/15.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hkystyle.swagger.apidoc"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2 APIdoc")
                .description("api根地址：http://127.0.0.1:5200/")
                .termsOfServiceUrl("http://127.0.0.1:5200/")
                .contact("22k life")
                .version("1.0")
                .build();
    }
}
