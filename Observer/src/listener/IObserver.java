package listener;

import publisher.FootballMatch;

public interface IObserver {
    void updateScore(String homeTeam, String guestTeam, int homeGoals, int guestGoals);
    void addFootballMatch(FootballMatch footballMatch);
    void removeFootballMatch(FootballMatch footballMatch);
}
