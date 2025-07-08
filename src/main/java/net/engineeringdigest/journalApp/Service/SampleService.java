package net.engineeringdigest.journalApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.engineeringdigest.journalApp.Entity.Sample;
import net.engineeringdigest.journalApp.Entity.Test;
import net.engineeringdigest.journalApp.Repository.SampleRepository;

@Service
public class SampleService {
	@Autowired
	private SampleRepository sampleRepository;

	public List<Sample>getAllSamples(){
		return (List<Sample>) sampleRepository.findAll();
	}
	
	public Sample getSampleById(Long id) {
		return (Sample) sampleRepository.findById(id).orElse(null);
		
	}
	
	public Sample createSample(Sample sample) {
		return (Sample) sampleRepository.save(sample);
	}
	  public Sample updateSample(Long id , Sample updateSample) {
		  return (Sample) sampleRepository.findById(id).map(sample -> {
	          ((Sample) sample).setName(updateSample.getName());
	          ((Sample) sample).setSurname(updateSample.getSurname());
	          return sampleRepository.save(sample);
	      }).orElse(null);
	  }
	
	  public void deleteSample(Long id) {
	      sampleRepository.deleteById(id);
	  }

}
