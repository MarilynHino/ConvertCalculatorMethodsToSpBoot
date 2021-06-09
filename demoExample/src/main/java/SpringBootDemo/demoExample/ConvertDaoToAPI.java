package SpringBootDemo.demoExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Annotion need to be here
@RestController
public class ConvertDaoToAPI {

	@GetMapping("/helloMessage") // "/helloMessage") name could be anything
	public String message() { // http://localhost:8080/helloMessage
		String message = ("Hello, this is spring boot!!!");

		return message;
	}

	@GetMapping("/sum/{val1}/+/{val2}")
	public int sum(@PathVariable int val1, @PathVariable int val2) {

		int result = val1 + val2;

		return result;
	}

	@GetMapping("/multiCal/{hight}/*/{base}")
	public float multiCal(@PathVariable float hight, @PathVariable float base) {

		float result = (hight * base) / 2;

		return result;
	}

	@GetMapping("/subCal/{int1}/-/{int2}")
	public Integer subCal(@PathVariable Integer int1, @PathVariable Integer int2) {

		Integer result = (int1 - int2);

		return result;
	}

	@GetMapping("/devtiCal/{num1}///{num2}")
	public float devtiCal(@PathVariable float num1, @PathVariable float num2) {

		float result = (num1 / num2);

		return result;
	}

}
