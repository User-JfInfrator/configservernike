package br.com.tech4me.configservernike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigservernikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigservernikeApplication.class, args);
	}

}
