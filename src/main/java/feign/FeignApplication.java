package feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class FeignApplication {
	
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "feign");
		SpringApplication.run(FeignApplication.class, args);
	}
}
