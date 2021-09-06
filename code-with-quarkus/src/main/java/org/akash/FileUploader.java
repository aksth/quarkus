package org.akash;

import io.minio.MinioClient;
import io.minio.errors.MinioException;
import org.xmlpull.v1.XmlPullParserException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@ApplicationScoped
public class FileUploader {

    @Inject
    MinioProperties minioProperties;

    public void uploadFile()
    throws NoSuchAlgorithmException, IOException, InvalidKeyException, XmlPullParserException {
        try {
            // Create a minioClient with the MinIO Server name, Port, Access key and Secret key.
            //MinioClient minioClient = new MinioClient("https://play.min.io", "Q3AM3UQ867SPQQA43P2F", "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
            MinioClient minioClient = new MinioClient(minioProperties.getUrl(), minioProperties.getAccesskey(), minioProperties.getSecretkey());

            // Check if the bucket already exists.
            boolean isExist = minioClient.bucketExists("asiatrip");
            if (isExist) {
                System.out.println("Bucket already exists.");
            } else {
                // Make a new bucket called asiatrip to hold a zip file of photos.
                minioClient.makeBucket("asiatrip");
            }

            // Upload the zip file to the bucket with putObject
            minioClient.putObject("asiatrip", "asiaphotos.zip", "/home/akash/Pictures/photos.zip", null);
            System.out.println("/home/akash/Pictures/photos.zip is successfully uploaded as photos.zip to `asiatrip` bucket.");
        } catch (
                MinioException e) {
            System.out.println("org.akash.Error occurred: " + e);
        }
    }
}
