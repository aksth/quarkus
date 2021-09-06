package org.akash.soapclient;

import java.net.URL;

public class HelloWorldServiceClient {
	
	public static HelloWorldServiceClient get() {
		return new HelloWorldServiceClient();
	}
	
    public String getHelloWorldAsString(String name){
    	
    	try {
	        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
	
	        HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
	        HelloWorld helloWorldProxy = helloWorldImplService.getHelloWorldImplPort();
	
	        return helloWorldProxy.getHelloWorldAsString(name);
    	}catch(Exception e) {
    		return e.getMessage();
    	}

    }

}
