package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "HELLO", fallback = FeignServiceFallback.class)
public interface FeignService {
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name") String name);
}
