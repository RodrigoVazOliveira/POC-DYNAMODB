package br.dev.rvz.pocdynamoDB.config;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;

@Configuration
public class DynamoDBConfig {

    @Bean
    protected DynamoDBMapper dynamoDBMapper() {
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(clientBuild());
        return dynamoDBMapper;
    }

    @Bean
    protected AmazonDynamoDB clientBuild() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withRegion(Region.US_EAST_2.toString())
                .build();
        return client;
    }
}
