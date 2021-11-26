package test_package.api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import main_package.api.assertions.ChallengeAssert;
import main_package.api.clients.ChallengeClient;
import main_package.api.models.Challenge;
import main_package.engine.test_engine.OnixApiTestRunner;
import main_package.api.db.ChallengeDb;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public class ChallengeApiTest extends OnixApiTestRunner {
    ChallengeClient challengeClient;
    ChallengeAssert challengeAssert;
    ChallengeDb challengeDb;
    Map<Integer, Challenge> expectedMap;
    @BeforeClass
    public void beforeChallengeTests() {
        challengeClient = new ChallengeClient(user);
        challengeAssert = new ChallengeAssert();
        challengeDb = new ChallengeDb();
        expectedMap = challengeDb.selectAll();
    }
    @Test(description = "Simply get all challenges from database and comparing results with challenges from response")
    public void getChallengeTest() {
        Response response = challengeClient.getChallenge();
        JsonPath jsonPath = response.jsonPath();
        Map<Integer, Challenge> actualMap = Challenge.getMap(jsonPath.getList("$", Challenge.class));
        challengeAssert
                .softCheckChallengeMaps(actualMap, expectedMap)
                .softCheckStatusCode(response.getStatusCode(), 200)
                .assertAll(response);
    }

    @Test(dataProvider = "eachChallenge")
    public void getChallenge_id_Test(Response response, Challenge expected) {
        Challenge actual = response.jsonPath().getObject("$", Challenge.class);
        challengeAssert
                .softCheckModels(actual, expected)
                .softCheckStatusCode(response.getStatusCode(), 200)
                .assertAll(response);
    }
    @DataProvider
    public Object[][] eachChallenge() {
        Object[][] objects = new Object[expectedMap.size()][];
        int counter = 0;
        for(Map.Entry<Integer, Challenge> entry : expectedMap.entrySet()) {
                    objects[counter++] = new Object[]{challengeClient.getChallenge_id(entry.getKey()), entry.getValue()};
        }
        return objects;
    }

}
