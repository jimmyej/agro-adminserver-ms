package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AgroAdminserverMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroAdminserverMsApplication.class, args);
	}

}
