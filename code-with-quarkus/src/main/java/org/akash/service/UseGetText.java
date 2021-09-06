package org.akash.service;

import javax.inject.Inject;

public class UseGetText {

    @Inject
    GetText getText;

    public UseGetText(){}

    public UseGetText(GetText getText){
        this.getText = getText;
    }

    public String get(){
        return getText.get();
    }
}
