package main_package.api.assertions;

import main_package.api.models.Challenge;
import main_package.engine.test_engine.OnixApiAssert;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class ChallengeAssert extends OnixApiAssert {

    public ChallengeAssert softCheckChallengeMaps(Map<Integer, Challenge> actual, Map<Integer, Challenge> expected) {
        for(Map.Entry<Integer, Challenge> a : actual.entrySet()) {
            softCheckModels(a.getValue(), expected.get(a.getKey()));
        }
        return this;
    }
    public void checkMaps(Map<Integer, Challenge> actual, Map<Integer, Challenge> expected) {
        softCheckChallengeMaps(actual, expected).assertAll();
    }

    public ChallengeAssert softCheckModels(Challenge actual, Challenge expected) {
        SoftAssert softAssert = getSoftAssert();
        int acId = actual.getId();
        int exId = expected.getId();
        softMessage(
                acId == exId,
                "Challenge.id correct",
                "Challenge.id is " + acId + " but expected " + exId
        );
        softAssert.assertEquals(acId, exId);
        String acName = actual.getName();
        String exName = expected.getName();
        softMessage(
                acName.equals(exName),
                "Challenge.name is correct",
                "Challenge.name is " + acName + " but expected " + exName
        );
        softAssert.assertEquals(acName, exName);
        String acStart = actual.getStart();
        String exStart = expected.getStart();
        softMessage(
                acStart.equals(exStart),
                "Challenge.start is correct",
                "Challenge.start is " + acStart + " but expected " + exStart
        );
        softAssert.assertEquals(acStart, exStart);
        String acEnd = actual.getEnd();
        String exEnd = expected.getEnd();
        softMessage(
                acStart.equals(exStart),
                "Challenge.end is correct",
                "Challenge.end is " + acStart + " but expected " + exStart
        );
        softAssert.assertEquals(acEnd, exEnd);
        boolean ac__close_enrollment = actual.isClose_enrollment();
        boolean ex__close_enrollment = expected.isClose_enrollment();
        softMessage(
                ac__close_enrollment == ex__close_enrollment,
                "Challenge.close_enrollment is correct",
                "Challenge.close_enrollment is " + ac__close_enrollment + " but expected " + ex__close_enrollment
        );
        softAssert.assertEquals(ac__close_enrollment, ex__close_enrollment);
        boolean ac__finished = actual.isFinished();
        boolean ex__finished = expected.isFinished();
        softMessage(
                ac__finished == ex__finished,
                "Challenge.finished is corect",
                "Challenge.finished is " + ac__finished + " but expected " + ex__finished
                );
        softAssert.assertEquals(ac__finished, ex__finished);
        return this;
    }
    public void checkModels(Challenge actual, Challenge expected) {
        softCheckModels(actual, expected).assertAll();
    }

}
