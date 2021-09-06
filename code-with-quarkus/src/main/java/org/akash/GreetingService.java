package org.akash;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService implements GreetingServiceInterface{

    public String greeting(String name){
        return "hello 123 "+name;
    }

}