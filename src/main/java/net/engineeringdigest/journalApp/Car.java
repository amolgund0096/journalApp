package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

	@Autowired
	private Dog dog;
	
	@GetMapping("/ok")
	public String ok() {
		return dog.sayFun();
	}
	@Autowired
	private Cat cat;
	
	@GetMapping("/Add")
	public int sayOk() {
		return cat.Addition();
	}
	
	@Autowired
	private Bike bike;
	
	@GetMapping("/bike")
	public String sayHi() {
		return bike.sayHi();
	}
}
