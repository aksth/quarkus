package org.akash;

import io.quarkus.test.Mock;

@Mock
public class FakeGreetingService implements GreetingServiceInterface{

    private String output;

    public String greeting(String name){
        output = "hello from fake greeting service "+name;
        return output;
    }

    public String getOutput() {
        return output;
    }
}
