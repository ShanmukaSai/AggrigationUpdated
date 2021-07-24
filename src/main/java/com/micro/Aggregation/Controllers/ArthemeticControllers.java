package com.micro.Aggregation.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArthemeticControllers {
	
		int a,b;

		@RequestMapping ("/add/{a}/{b}")
		public String add(@PathVariable("a")int a1,@PathVariable("b")int b1) {
			
			int c=a1+b1;
			return ""+c;
			
		}
		@RequestMapping ("/sub/{a}/{b}")
		public String sub(@PathVariable("a")int a1,@PathVariable("b")int b1) {
			
			int c=a1-b1;
			return ""+c;
			
		}
		
		@RequestMapping ("/mul/{a}/{b}")
		public String mul(@PathVariable("a")int a1,@PathVariable("b")int b1) {
			
			int c=a1*b1;
			return ""+c;
			
		}
		@RequestMapping ("/div/{a}/{b}")
		public String div(@PathVariable("a")int a1,@PathVariable("b")int b1) {
			
			int c=a1/b1;
			return ""+c;
			
		}
		


}
