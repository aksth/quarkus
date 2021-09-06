package org.akash;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
public class Person {

    Long id;
    String name;
    String address;

    @JsonbProperty("id_no")

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @JsonbProperty("full_name")

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("full_address")

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}