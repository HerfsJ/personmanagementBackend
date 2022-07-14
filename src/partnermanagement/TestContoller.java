package partnermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
	
	@Autowired
	TestingService testingService;
	
	@GetMapping(path="runTests")
	public void runTests() {
	}
}
