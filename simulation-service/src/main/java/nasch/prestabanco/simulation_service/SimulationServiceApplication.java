package nasch.prestabanco.simulation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimulationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulationServiceApplication.class, args);
	}

}
