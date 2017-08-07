package feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringCloudApplication
@EnableFeignClients
@EnableHystrix
public class FeignApplication {
	
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "feign");
		SpringApplication.run(FeignApplication.class, args);
	}
}
