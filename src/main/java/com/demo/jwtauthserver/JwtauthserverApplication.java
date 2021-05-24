package com.demo.jwtauthserver;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.demo.jwtauthserver.exception.ConnectionToS3Exception;
import com.demo.jwtauthserver.model.entity.User;
import com.demo.jwtauthserver.security.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class JwtauthserverApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JwtauthserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


//        AWSCredentials credentials = new BasicAWSCredentials(
//                "AKIARMAYTBEW3B4VYP6C",
//                "FHKBRHeBho/q2BtKABtX3kEmgxDKCmSQaNOdTxl1"
//        );
//
//
//
//        AmazonS3 s3client = AmazonS3ClientBuilder
//                .standard()
//                .withCredentials(new AWSStaticCredentialsProvider(credentials))
//                .withRegion(Regions.US_EAST_2)
//                .build();
//
//        S3Object s3object = s3client.getObject("my-first-bucket-a", "users.json");
//        try (S3ObjectInputStream inputStream = s3object.getObjectContent()) {
//
//
//            System.out.println(s3client.listBuckets());
//            List<User> users = new ObjectMapper().readValue(inputStream, List.class);
//
//            System.out.println(users);
//
//        } catch (Exception e) {
//            System.out.println(e);
//            throw new ConnectionToS3Exception("Internal server error");
//        }


//
//
//        System.out.println(s3client.listBuckets());

    }
}