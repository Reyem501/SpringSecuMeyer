package fr.limayrac.spwebflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpwebflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpwebflowApplication.class, args);
	}

}
