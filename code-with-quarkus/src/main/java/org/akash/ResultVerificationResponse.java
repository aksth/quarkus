package org.akash;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ResultVerificationResponse {
    //result is 'String' in REST API, but 'Boolean' in db
    private Boolean result;
    private java.lang.Error error;
    private Authorization authorization;

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof ResultVerificationResponse)) return false;
        ResultVerificationResponse response = (ResultVerificationResponse) o;

        return Objects.equals(result, response.result)
                && Objects.equals(error, response.error)
                && Objects.equals(authorization, response.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, error, authorization);
    }

}
