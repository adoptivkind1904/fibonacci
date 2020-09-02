package nils.rest.fibonacci;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/")
public class HelloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value="/id", method=RequestMethod.GET)
	public String fibonacci(@RequestParam("id") String id) {
		if(id == null) {
			return "Uebergabeparameter war null";
		}
		
		
		Integer i = Integer.parseInt(id);
		
		
		
		if(i<=0) {
			return "Dies ist keine gueltige Eingabe";
		}
		
		
		
		StringBuilder result = new StringBuilder("Die Zahl der Fibonacci-Folge an der Stelle ");
		result.append(i).append(" lautet ").append(calcFibonacci(i));
		
		return result.toString();
	}
	
	protected static int calcFibonacci(int id) {
		int x =1,  y = 1;
		
		if(id==1||id==2) {
			return 1;
		}
		
		for(int i=3;i<=id;i++) {
			int z= x+y;
			x=y;
			y=z;
		}
		
		return y;
		
	}
	
}
