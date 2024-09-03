package com.example.com.example.first.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {
	
	public String getMessage() {
		return "Hello from GreetingComponent";
	}
	
	public String postMessage() {
		return "Post message from GreetingComponent";
	}
	
	public String putMessage() {
		return "Put message to GreetingComponent";
	}
	
	public String deleteMessage() {
		return "Delete message to GreetingComponent";
	}

}
