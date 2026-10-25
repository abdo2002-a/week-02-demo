package my.utm.SCSE3203.week02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Week02DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week02DemoApplication.class, args);
	}

	@GetMapping("/profile")
public String profile() {
    return "profile";
}
}
