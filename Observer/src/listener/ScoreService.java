package listener;

import publisher.FootballMatch;

import java.util.HashSet;
import java.util.Set;

public class ScoreService implements IObserver {

    private String serviceName;
    Set<FootballMatch> matches;

    public ScoreService(String serviceName) {
        this.matches = new HashSet<>();
        this.serviceName = serviceName;
    }

    @Override
    public void updateScore(String homeTeam, String guestTeam, int homeGoals, int guestGoals) {
        System.out.println("Service: " + serviceName);
        System.out.println("--------Gooal!--------");
        System.out.println(homeTeam + " - " + guestTeam + " (" + homeGoals + " - " + guestGoals + ")");
        System.out.println("----------------------\n\n");
    }

    @Override
    public void addFootballMatch(FootballMatch footballMatch) {
        matches.add(footballMatch);
    }

    @Override
    public void removeFootballMatch(FootballMatch footballMatch) {
        matches.remove(footballMatch);
    }
}
