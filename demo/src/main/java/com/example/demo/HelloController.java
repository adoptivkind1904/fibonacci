package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/{id}")
	public String fibonacci(int id) {
		StringBuilder result = new StringBuilder("Die Zahl der Fibonacci-Folge an der Stelle ");
		result.append(id).append(" lautet").append(calcFibonacci(id));
		
		return result.toString();
	}
	
	protected static int calcFibonacci(int id) {
		int x =1,  y = 1;
		
		if(id<=0) {
			return 0;
		}
		
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
