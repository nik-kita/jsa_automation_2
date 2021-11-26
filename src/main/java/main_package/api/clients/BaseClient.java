package main_package.api.clients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main_package.api.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class BaseClient {
    private String baseUrl = "https://testing-jamessmith-academy.herokuapp.com";
    private String client_id;
    public Logger logger = LoggerFactory.getLogger(this.getClientId());
    private String token;

    private String generateToken(User user) {
        Map<String, String> forBody = new HashMap<>();
        forBody.put("grant_type", "password");
        forBody.put("username", user.getUsername());
        forBody.put("password", user.getPassword());
        forBody.put("scope", "read");
        forBody.put("client_id", getClientId());
        forBody.put("client_secret", getClientSecret());
        Response response = given(baseRequestSpecification()).queryParams(forBody).post("/o/token/");
        System.out.println(response.toString());
        return response.path("token_type") + " " + response.path("access_token");
    }


    public RequestSpecification baseRequestSpecification() {
        RequestSpecBuilder builder = new RequestSpecBuilder()
                .setConfig(RestAssuredConfig.config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .setConfig(RestAssuredConfig.config().logConfig(LogConfig.logConfig().enablePrettyPrinting(true)))
                .setBaseUri(baseUrl)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON);
        return builder.build();
    }

    protected RequestSpecification baseRequestSpecification(User user) {
        if(token == null) {
            token = generateToken(user);
        }
        RequestSpecBuilder builder = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", token);
        return builder.build();
    }

    private String client_secret;
    private String getClientId() {
        if(!(client_id == null)) {
            return client_id;
        }
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/credentials.properties"));
        } catch (IOException e) {
            System.err.println("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }
        client_id = properties.getProperty("jsaTestingServerClientId");
        return client_id;
    }

    private String getClientSecret() {
        if(!(client_secret == null)) {
            return client_secret;
        }
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/credentials.properties"));
        } catch (IOException e) {
            System.err.println("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }
        client_secret = properties.getProperty("jsaTestingServerClientSecret");
        return client_secret;
    }
}
