package by.tms.lesson5530onl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * @author simonpirko
 * @version 1.0
 * @since 11.12.24
 */

//@PropertySource("classpath:application.properties")
@Configuration
public class AWSConfiguration {

//    @Value("${s3.accessKey}")
//    private String accessKey;
//    @Value("${s3.secretKey}")
//    private String secretKey;

//    @Bean
    public S3Client s3Client() {
//        Region region = Region.EU_CENTRAL_1;

//        AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);

//        return S3Client.builder()
//                .region(region)
//                .credentialsProvider(StaticCredentialsProvider.create(credentials))
//                .build();
        return null;
    }
}
