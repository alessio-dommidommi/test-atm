package net.asforil.atmRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AtmRestApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AtmRestApplication.class, args);
	}
	
	
	@Bean	
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	
	
	

}
