package org.akash;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Authorization {

    private String id;
    private String keyid;
    private String signature;
    //timestamp is 'String' in REST API, but 'Long' in db
    private Long timestamp;

    public static class Builder {

        private String id;
        private String keyid;
        private String signature;
        //timestamp is 'String' in REST API, but 'Long' in db
        private Long timestamp;

        public Builder(String id) {
            this.id = id;
        }

        public Builder keyId(String keyid) {
            this.keyid = keyid;
            return this;
        }

        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Authorization build() {
            Authorization authorization = new Authorization();
            authorization.id = this.id;
            authorization.keyid = this.keyid;
            authorization.signature = this.signature;
            authorization.timestamp = this.timestamp;
            return authorization;
        }

    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Authorization)) return false;
        Authorization auth = (Authorization) o;
        return Objects.equals(id, auth.id)
                && Objects.equals(keyid, auth.keyid)
                && Objects.equals(signature, auth.signature)
                && timestamp == auth.timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyid, signature);
    }

}
