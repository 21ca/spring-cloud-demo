package feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignCotroller {
	@Autowired
	private FeignService feignService;

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name") String name) {
		return feignService.hello(name);
	}
}
