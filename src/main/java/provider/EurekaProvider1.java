package provider;

import org.springframework.boot.SpringApplication;

public class EurekaProvider1 {
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "provider1");
		SpringApplication.run(EurekaApplication.class, args);
	}
}
