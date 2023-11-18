package com.decify.swaggerapp;

import org.apache.naming.SelectorContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.nio.channels.spi.SelectorProvider;

@SpringBootApplication
@EnableSwagger2
public class SwaggerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAppApplication.class, args);
	}

}
