package org.akash.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GetTextHelloWorld implements GetText {

    public String get(){
        return "Hello World";
    }

}
