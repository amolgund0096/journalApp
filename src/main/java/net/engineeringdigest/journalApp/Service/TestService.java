package net.engineeringdigest.journalApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.engineeringdigest.journalApp.Entity.Test;
import net.engineeringdigest.journalApp.Repository.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository testRepository;
	
	public List<Test> getAllTests(){
		return (List<Test>) testRepository.findAll();
	}
	
	public Test getTestById(Integer id) {
		return (Test) testRepository.findById(id).orElse(null);
	}
	
	public Test createTest(Test Tests) {
		return (Test) testRepository.save(Tests);
	}
	
  public Test updateTest(Integer id , Test updateTest) {
	  return (Test) testRepository.findById(id).map(Tests -> {
          ((Test) Tests).setFirst_name(updateTest.getFirst_name());
          ((Test) Tests).setMiddle_name(updateTest.getMiddle_name());
          ((Test) Tests).setLast_name(updateTest.getLast_name());
          ((Test) Tests).setEmail(updateTest.getEmail());
          ((Test) Tests).setContact(updateTest.getContact());
          ((Test) Tests).setEducation(updateTest.getEducation());
          return testRepository.save(Tests);
      }).orElse(null);
	  
  }

  public void deleteTests(Integer id) {
      testRepository.deleteById(id);
  }


}
