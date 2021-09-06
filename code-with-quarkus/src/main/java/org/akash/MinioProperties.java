package org.akash;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigProperties(prefix = "minio")
public class MinioProperties {
    private String url;
    private String accesskey;
    private String secretkey;
    private String bucketname;
    private boolean initializeStart;
}
