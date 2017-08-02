package provider;

import org.springframework.boot.SpringApplication;

public class EurekaProvider2 {
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "provider2");
		SpringApplication.run(EurekaApplication.class, args);
	}
}
