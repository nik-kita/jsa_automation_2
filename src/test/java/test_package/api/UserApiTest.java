package test_package.api;

import main_package.engine.test_engine.OnixApiTestRunner;
import org.testng.annotations.Test;

public class UserApiTest extends OnixApiTestRunner {

    @Test
    public void getCoachIdleTest() {
        userClient.getCoachIdle().then().statusCode(200);
    }

    @Test
    public void patchCoachIdle_id_Test() {
        userClient.patchCoachIdle_id(1).then().statusCode(200);
    }

    @Test
    public void getCoachProfileTest() {
        userClient.getCoachProfile().then().statusCode(200);
    }

    @Test
    public void postCoachProfileTest() {
        userClient.postCoachProfile().then().statusCode(200);
    }

    @Test
    public void patchCoachProfileTest() {
        userClient.patchCoachProfile().then().statusCode(200);
    }

    @Test
    public void postCoachesNotesTest() {
        userClient.postCoachNotes().then().statusCode(201);
    }

    @Test
    public void getCoachesNotes_id_Test() {
        userClient.getCoachesNotes_id(1).then().statusCode(200);
    }

    @Test
    public void patchCoachesNotes_id_Test() {
        userClient.patchCoachesNotes_id(1).then().statusCode(200);
    }

    @Test
    public void postCreateUserTest() {
        userClient.postCreateUser("Vasya", "strongpassword").then().statusCode(201);
    }

    @Test
    public void postFitnessTrackerTest() {
        userClient.postFitnessTracker().then().statusCode(201);
    }

    @Test
    public void getFitnessTracker_id_Test() {
        userClient.getFitnessTracker_id(1).then().statusCode(200);
    }

    @Test
    public void patchFitnessTracker_id_Test() {
        userClient.patchFitnessTracker_id(1).then().statusCode(200);
    }

    @Test
    public void getMomentumScoreTest() {
        userClient.getMomentumScore(0, 0, 0, 0).then().statusCode(200);
    }

    @Test
    public void postMomentumScore() {
        userClient.postMomentumScore(0, 0, 0).then().statusCode(201);
    }

    @Test
    public void getMomentumScore_id_Test() {
        userClient.getMomentumScore_id(1).then().statusCode(200);
    }

    @Test
    public void putMomentumScore_id_Test() {
        userClient.putMomentumScore_id(1, 0, 0, 0).then().statusCode(200);
    }

    @Test
    public void patchMomentumScore_id_Test() {
        userClient.patchMomentumScore_id(1, 1, 1, 1).then().statusCode(200);
    }

    @Test
    public void deleteMomentumScore_id_Test() {
        userClient.deleteMomentumScore_id(1).then().statusCode(204);
    }

    @Test
    public void getProfileTest() {
        userClient.getProfile().then().statusCode(200);
    }

    @Test
    public void getProfile_id_Test() {
        userClient.getProfile_id(1).then().statusCode(200);
    }

    @Test
    public void patchProfile_id_Test() {
        userClient.patchProfile_id(1).then().statusCode(200);
    }

    @Test
    public void postRatingPrompt() {
        userClient.postRatingPrompt().then().statusCode(201);
    }

    @Test
    public void getRatingPrompt_id_Test() {
        userClient.getRatingPrompt_id(1).then().statusCode(200);
    }

    @Test
    public void patchRatingPrompt_id_Test() {
        userClient.patchRatingPrompt_id(1).then().statusCode(200);
    }

    @Test
    public void postSocialTermsTest() {
        userClient.postSocialTerms(
                1,
                "ikita",
                true,
                true,
                true,
                "premium",
                "blablabal",
                "blabalbalsecret",
                "Baerer balbalbal",
                "balaldfa;lfk").then().statusCode(201);
    }

    @Test
    public void postSocialConnectTest() {
        userClient.postSocial__connect().then().statusCode(201);
    }

    @Test
    public void postSocialDisconnectTest() {
        userClient.postSocial__disconnect().then().statusCode(201);
    }

    @Test
    public void patchSocialPasswordTest() {
        userClient.patchSocial__password().then().statusCode(200);
    }

    @Test
    public void getUnitsSettings_id_Test() {
        userClient.getUnitsSettings_id(1).then().statusCode(200);
    }

    @Test
    public void patchUnitsSettings_id_Test() {
        userClient.patchUnitsSettings_id(1).then().statusCode(200);
    }

    @Test
    public void postVerifyEmailResendVerificationEmailTest() {
        userClient.postVerifyEmail__resendVerificationEmail().then().statusCode(201);
    }

    @Test
    public void getVerifyEmail_id_Test() {
        userClient.getVerifyEmail_id(1).then().statusCode(200);
    }

    @Test
    public void getWorkoutPreferenceTest() {
        userClient.getWorkoutPreference().then().statusCode(200);
    }

    @Test
    public void getWorkoutPreference_id_Test() {
        userClient.getVerifyEmail_id(1).then().statusCode(200);
    }

    @Test
    public void patchWorkoutPreference_id_Test() {
        userClient.patchWorkoutPreference_id(1).then().statusCode(200);
    }

}
