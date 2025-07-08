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

import net.engineeringdigest.journalApp.Entity.Sample;
import net.engineeringdigest.journalApp.Service.SampleService;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	@GetMapping
	public List<Sample>getAllSamples(){
		return sampleService.getAllSamples();
	}
	
	@GetMapping("/{id}")
	public Sample geSampleById(@PathVariable  Long id) {
		return sampleService.getSampleById(id);
	}
	
	@PostMapping
	public Sample createSample(@RequestBody Sample sample) {
		return sampleService.createSample(sample);
	}
	
	@PutMapping("/{id}")
    public Sample updateSample(@PathVariable Long id, @RequestBody Sample sample) {
        return sampleService.updateSample(id, sample);
    }

 
	@DeleteMapping("/{id}")
	public void deleteSample(@PathVariable Long id) {
		sampleService.deleteSample(id);
	}


}
