package net.mv.week5.webservice.soap;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class HelloWorldDemo {

	public static void main(String[] args) {
		HelloWorld hw;
		try {
			hw = new HelloWorldServiceLocator().getHelloWorld();
			
			String result =hw.sayHello("Tim");
			
			System.out.println(result);
		
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
		
		

	}

}
