package com.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String printWelcome() {

			System.out.println("Hello World");
		return "hello";

		}
}
