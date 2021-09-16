import listener.ScoreService;
import publisher.FootballMatch;

public class Main {
    public static void main(String[] args) {
        ScoreService livesSports = new ScoreService("Live Sports");
        ScoreService scoresOnline = new ScoreService("Scores Online");
        ScoreService liveGoals = new ScoreService("Live Goals");

        FootballMatch footballMatch = new FootballMatch("Man Utd", "Chelsea");

        footballMatch.addObserver(liveGoals);
        footballMatch.addObserver(livesSports);
        footballMatch.addObserver(scoresOnline);

        footballMatch.addHomeGoal();
        footballMatch.addGuestGoal();
        footballMatch.addGuestGoal();

    }
}
