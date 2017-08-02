package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerCotroller {
	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/consumer")
	public String index() {
		return template.getForEntity("http://HELLO/hello", String.class).getBody();
	}

}
