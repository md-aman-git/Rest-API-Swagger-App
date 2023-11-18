package com.decify.swaggerapp;

import org.apache.naming.SelectorContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.nio.channels.spi.SelectorProvider;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SwaggerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAppApplication.class, args);
	}

	@Bean
	public Docket configureSwagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.decify"))
				.build()
				.apiInfo(getApiDetails());
	}

	private ApiInfo getApiDetails() {
		return new ApiInfo(
				"Address Book",
				"Sample API for Swagger UI Test",
				"1.0",
				"Free to use",
				new Contact("Md Aman", "com.decify", "a@b.com"),
				"API Licence",
				"com.decify",
				Collections.emptyList()
		);
	}
}
