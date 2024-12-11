package by.tms.lesson5530onl;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author simonpirko
 * @version 1.0
 * @since 11.12.24
 */
//@Service
public class AWSS3Service {

    private final S3Client s3Client;

    String bucketName = "mybucket2-eu-central-1";

    public AWSS3Service(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    public void uploadImage(File file) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("company", "TMS");
        metadata.put("environment", "development");

        s3Client.putObject(request ->
                        request
                                .bucket(bucketName)
                                .key(UUID.randomUUID().toString())
                                .metadata(metadata)
                                .ifNoneMatch("*"),
                file.toPath());
    }
}
