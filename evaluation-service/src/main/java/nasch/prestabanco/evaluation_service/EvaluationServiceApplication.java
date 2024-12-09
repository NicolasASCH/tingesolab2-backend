package nasch.prestabanco.evaluation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EvaluationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluationServiceApplication.class, args);
	}

}
