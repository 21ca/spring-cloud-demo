package feign;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService {

	@Override
	public String hello(String name) {
		return "Fall back";
	}

}
