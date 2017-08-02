package server;

import org.springframework.boot.SpringApplication;

public class EurekaServer2 {
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "server2");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
