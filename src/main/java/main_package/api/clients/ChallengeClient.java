package main_package.api.clients;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main_package.api.models.Challenge;
import main_package.api.models.User;

import static io.restassured.RestAssured.given;

public class ChallengeClient extends BaseClient{
    private User user;
    private static String challenge_url = "/challenge";
    private static String get_challenge = challenge_url + "/challenge/";
    private static String get_challenge__id = challenge_url + "/challenge/{id}";
    private RequestSpecification request;

    public ChallengeClient(User user) {
        this.user = user;
        this.request = given(baseRequestSpecification(user));
    }

    public Response getChallenge() {
        return request.get(get_challenge);
    }

    public Response getChallenge_id(int id) {
        return request.pathParam("id", id).get(get_challenge__id);
    }
}
