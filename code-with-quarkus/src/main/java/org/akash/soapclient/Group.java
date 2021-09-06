package org.akash.soapclient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Group {
    String id;

    public Group(String id){
        this.id = id;
    }
}
