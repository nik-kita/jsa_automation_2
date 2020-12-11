package main_package.api.clients;

import io.restassured.response.Response;
import main_package.api.models.User;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UserClient extends BaseClient {
    private static String user_url = "/users";
    private static String get_coach_idle = user_url + "/coach-idle";
    private static String patch_coach_idle__id = user_url + "/coach-idle/{id}";
    private static String get_coach_profile = user_url + "/coach-profile";
    private static String post_coach_profile = user_url + "/coach-profile";
    private static String patch_coach_profile = user_url + "/coach-profile";
    private static String post_coaches_notes = user_url + "/coaches-notes";
    private static String get_coaches_notes__id = user_url + "/coaches-notes/{id}";
    private static String patch_coaches_notes__id = user_url + "/coaches-notes/{id}/";
    private static String post_create_user = user_url + "/create-user/";
    private static String post_fitness_tracker = user_url + "/fitness-tracker/";
    private static String get_fitness_tracker__id = user_url + "/fitness-tracker/{id}/";
    private static String patch_fitness_tracker__id = user_url + "/fitness-tracker/{id}/";
    private static String get_momentum_score = user_url + "/momentum-score/";
    private static String post_momentum_score = user_url + "/momentum-score/";
    private static String get_momentum_score__id = user_url + "/momentum-score/{id}/";
    private static String put_momentum_score__id = user_url + "/momentum-score/{id}/";
    private static String patch_momentum_score__id = user_url + "/momentum-score/{id}/";
    private static String delete_momentum_score__id = user_url + "/momentum-score/{id}/";
    private static String get_profile = user_url + "/profile/";
    private static String get_profile__id = user_url + "/profile/{id}/";
    private static String patch_profile__id = user_url + "/profile/{id}/";
    private static String post_rating_prompt__id = user_url + "/rating-prompt/";
    private static String get_rating_prompt__id = user_url + "/rating-prompt/{id}/";
    private static String patch_rating_prompt__id = user_url + "/rating-prompt/{id}/";
    private static String post_social_terms = user_url + "/social-terms/";
    private static String post_social__connect = user_url + "/social/connect/";
    private static String post_social__disconnect = user_url + "/social/disconnect/";
    private static String patch_social__password = user_url + "/social/password/";
    private static String post_units_settings = user_url + "/units-settings/";
    private static String get_units_settings__id = user_url + "/units-settings/{id}";
    private static String patch_units_settings__id = user_url + "/units-settings/{id}";
    private static String post_verify_email__resend_verification_email = user_url + "/verify-email/resend_verification_email/";
    private static String get_verify_email__id = user_url + "/verify-email/{id}/";
    private static String get_workout_preference = user_url + "/workout-preference/";
    private static String get_workout_preference__id = user_url + "/workout-preference/{id}/";
    private static String patch_workout_preference__id = user_url + "/workout-preference/{id}/";


    private User user;

    public UserClient(User user) {
        this.user = user;
    }


    public Response getCoachIdle() {
        return given(baseRequestSpecification(user)).get(get_coach_idle);
    }

    public Response patchCoachIdle_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_coach_idle__id);
    }

    public Response getCoachProfile() {
        return given(baseRequestSpecification(user)).get(get_coach_profile);
    }

    public Response postCoachProfile() {
        return given(baseRequestSpecification(user)).post(post_coach_profile);
    }

    public Response patchCoachProfile() {
        return given(baseRequestSpecification(user)).patch(patch_coach_profile);
    }

    public Response postCoachNotes() {
        return given(baseRequestSpecification(user)).post(post_coaches_notes);
    }

    public Response getCoachesNotes_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_coaches_notes__id);
    }

    public Response patchCoachesNotes_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_coaches_notes__id);
    }

    public Response postCreateUser(String username, String password) {
        return given(baseRequestSpecification(user))
                .param("username", username).param("password", password).post(post_create_user);
    }

    public Response postFitnessTracker() {
        return given(baseRequestSpecification(user)).post(post_fitness_tracker);
    }

    public Response getFitnessTracker_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_fitness_tracker__id);
    }

    public Response patchFitnessTracker_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_fitness_tracker__id);
    }

    public Response getMomentumScore(int year__lte, int year__gte, int week_number__lte, int week_number__gte) {
        return given(baseRequestSpecification(user))
                .pathParam("year__lte", year__lte)
                .pathParam("year__gte", year__gte)
                .pathParam("week_number__lte", week_number__lte)
                .pathParam("week_numbet__gte", week_number__gte)
                .get(get_momentum_score);
    }

    public Response postMomentumScore(int year, int week_number, int score) {
        return given(baseRequestSpecification(user))
                .param("year", year)
                .param("week_number", week_number)
                .param("score", score)
                .post(post_momentum_score);
    }

    public Response getMomentumScore_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_momentum_score__id);
    }

    public Response putMomentumScore_id(int id, int year, int week_number, int score) {
        return given(baseRequestSpecification(user))
                .pathParam("id", id)
                .param("year", year)
                .param("week_number", week_number)
                .param("score", score)
                .put(put_momentum_score__id);
    }

    public Response patchMomentumScore_id(int id, int year, int week_number, int score) {
        return given(baseRequestSpecification(user))
                .pathParam("id", id)
                .param("year", year)
                .param("week_number", week_number)
                .param("score", score)
                .patch(patch_momentum_score__id);
    }

    public Response deleteMomentumScore_id(int id) {
        return given(baseRequestSpecification(user))
                .pathParam("id", id)
                .delete(delete_momentum_score__id);
    }

    public Response getProfile() {
        return given(baseRequestSpecification(user)).get(get_profile);
    }

    public Response getProfile_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_profile__id);
    }

    public Response patchProfile_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_profile__id);
    }

    public Response postRatingPrompt() {
        return given(baseRequestSpecification(user)).post(post_rating_prompt__id);
    }

    public Response getRatingPrompt_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_rating_prompt__id);
    }

    public Response patchRatingPrompt_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_rating_prompt__id);
    }

    public Response postSocialTerms(
            int user_id,
            String name,
            boolean terms,
            boolean daily_subscribe,
            boolean marketing_subscribe,
            String grant_type,
            String client_id,
            String client_secret,
            String token,
            String backend
    ) {

        Map<String, Object> params = new HashMap<>();
        params.put("user_id", user_id);
        params.put("name", name);
        params.put("terms", terms);
        params.put("daily_subscribe", daily_subscribe);
        params.put("marketing_subscribe", marketing_subscribe);
        params.put("grant_type", grant_type);
        params.put("client_id", client_id);
        params.put("client_secret", client_secret);
        params.put("token", token);
        params.put("backend", backend);

        return given(baseRequestSpecification()).params(params).post(post_social_terms);
    }

    public Response postSocial__connect() {
        return given(baseRequestSpecification(user)).post(post_social__connect);
    }

    public Response postSocial__disconnect() {
        return given(baseRequestSpecification(user)).post(post_social__disconnect);
    }

    public Response patchSocial__password() {
        return given(baseRequestSpecification(user)).patch(patch_social__password);
    }

    public Response postUnitsSettings() {
        return given(baseRequestSpecification(user)).post(post_units_settings);
    }

    public Response getUnitsSettings_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_units_settings__id);
    }

    public Response patchUnitsSettings_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_units_settings__id);
    }

    public Response postVerifyEmail__resendVerificationEmail() {
        return given(baseRequestSpecification(user)).post(post_verify_email__resend_verification_email);
    }

    public Response getVerifyEmail_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_verify_email__id);
    }

    public Response getWorkoutPreference() {
        return given(baseRequestSpecification(user)).get(get_workout_preference);
    }

    public Response getWorkoutPreference_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).get(get_workout_preference__id);
    }

    public Response patchWorkoutPreference_id(int id) {
        return given(baseRequestSpecification(user)).pathParam("id", id).patch(patch_workout_preference__id);
    }

}
