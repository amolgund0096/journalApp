package net.engineeringdigest.journalApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journalApp.Entity.Test;
import net.engineeringdigest.journalApp.Service.TestService;

@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@GetMapping
	public List<Test>getAllTests(){
		return testService.getAllTests();
	}
	
	@GetMapping("/{id}")
	public Test getTestById(@PathVariable Integer id) {
		return testService.getTestById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteTests(@PathVariable Integer id) {
		testService.deleteTests(id);
	}
	
	 @PostMapping
	    public Test createTest(@RequestBody Test Tests) {
	        return testService.createTest(Tests);
	    }

	    @PutMapping("/{id}")
	    public Test updateTest(@PathVariable Integer id, @RequestBody Test Tests) {
	        return testService.updateTest(id, Tests);
	    }
}
