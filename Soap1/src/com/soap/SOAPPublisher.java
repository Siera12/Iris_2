package com.soap;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8885/ws/myperson", new PersonServiceImpl());  
	}

}