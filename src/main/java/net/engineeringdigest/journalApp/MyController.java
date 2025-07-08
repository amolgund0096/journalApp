package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/api")
	public String sayHello() {
		return "Hii Amol";
	}
}
