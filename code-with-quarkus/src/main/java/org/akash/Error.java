package org.akash;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Error {
    int code;
    String message;

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Error)) return false;
        Error error = (Error) o;
        return code == error.code
                && Objects.equals(message, error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }
}
