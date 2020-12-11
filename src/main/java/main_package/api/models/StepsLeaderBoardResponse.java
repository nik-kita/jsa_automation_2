package main_package.api.models;

public class StepsLeaderBoardResponse {
    private StepsLeaderboard steps_leaderboard;
    private StepsLeaderboard my_steps;

    public StepsLeaderboard getSteps_leaderboard() {
        return steps_leaderboard;
    }

    public StepsLeaderBoardResponse setSteps_leaderboard(StepsLeaderboard steps_leaderboard) {
        this.steps_leaderboard = steps_leaderboard;
        return this;
    }

    public StepsLeaderboard getMy_steps() {
        return my_steps;
    }

    public StepsLeaderBoardResponse setMy_steps(StepsLeaderboard my_steps) {
        this.my_steps = my_steps;
        return this;
    }
}
