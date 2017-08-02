package server;

import org.springframework.boot.SpringApplication;

public class EurekaServer1 {
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "server1");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
