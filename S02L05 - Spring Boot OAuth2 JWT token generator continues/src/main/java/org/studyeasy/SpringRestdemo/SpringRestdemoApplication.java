package org.studyeasy.SpringRestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.studyeasy.SpringRestdemo.config.RsaKeyProperties;

import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.enums.*;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
@SecurityScheme(name = "studyeasy-demo-api", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SpringRestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestdemoApplication.class, args);
	}

}
