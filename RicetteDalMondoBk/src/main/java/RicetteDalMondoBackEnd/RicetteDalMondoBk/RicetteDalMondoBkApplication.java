package RicetteDalMondoBackEnd.RicetteDalMondoBk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
	@Value("${spring.data.mongodb.uri:NON_LETTO}")
	private String uri;

	@GetMapping("/check-config")
	public String check() {
		return "L'URI caricato è: " + uri;
	}
}
@SpringBootApplication
public class RicetteDalMondoBkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RicetteDalMondoBkApplication.class, args);
	}

}
