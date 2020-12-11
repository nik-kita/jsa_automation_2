package main_package.api.db;

import main_package.api.models.Challenge;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ChallengeDb extends OnixJDBC {
    String select_all = "SELECT * FROM public.challenge_challenge ORDER BY id ASC";
    String id = "id";
    String name = "name";
    String start = "start";
    String end = "end";
    String close_enrollment = "close_enrollment";
    String finished = "finished";
    String first_month_notification = "first_month_notification";

    public String getFirst_month_notification() {
        return first_month_notification;
    }

    public ChallengeDb setFirst_month_notification(String first_month_notification) {
        this.first_month_notification = first_month_notification;
        return this;
    }

    public String getSecond_month_notification() {
        return second_month_notification;
    }

    public ChallengeDb setSecond_month_notification(String second_month_notification) {
        this.second_month_notification = second_month_notification;
        return this;
    }

    String second_month_notification = "second_month_notification";

    public Map<Integer, Challenge> selectAll() {
        Map<Integer, Challenge> challenges = new HashMap<>();
        logger.debug("Execute: {}", select_all);
        ResultSet resultSet = executeQuery(select_all);
        try {
            while (resultSet.next()) {
                Challenge challenge = new Challenge();
                challenge.setId(resultSet.getInt(id))
                        .setName(resultSet.getString(name))
                        .setStart(resultSet.getString(start))
                        .setEnd(resultSet.getString(end))
                        .setClose_enrollment(resultSet.getBoolean(close_enrollment))
                        .setFinished(resultSet.getBoolean(finished))
                        .setFirst_month_notification(resultSet.getBoolean(first_month_notification))
                        .setSecond_month_notification(resultSet.getBoolean(second_month_notification));
                challenges.put(challenge.getId(), challenge);
            }
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
        return challenges;
    }



}
