package org.akash;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ResultVerificationRequest {
    String cprnumber;
    String clienttimestamp;
    boolean result;
    Authorization authorization;
    java.lang.Error error;

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof ResultVerificationRequest)) return false;
        ResultVerificationRequest request = (ResultVerificationRequest) o;

        return Objects.equals(cprnumber, request.result)
                && Objects.equals(clienttimestamp, request.clienttimestamp)
                && Objects.equals(result, request.result)
                && Objects.equals(authorization, request.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cprnumber, clienttimestamp, result, authorization);
    }
}
