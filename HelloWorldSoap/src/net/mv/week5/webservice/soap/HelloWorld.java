package net.mv.week5.webservice.soap;

import java.util.Date;

public class HelloWorld {

	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	public Date getTime() {
		return new Date();
	}
	
	
}
