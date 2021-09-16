package publisher;

import listener.IObserver;

import java.util.HashSet;
import java.util.Set;

public class FootballMatch implements IObservable {

    Set<IObserver> observers;

    private String homeTeam;
    private String guestTeam;
    private int homeGoals;
    private int guestGoals;

    public FootballMatch(String homeTeam, String guestTeam) {
        observers = new HashSet<>();
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public void addHomeGoal() {
        homeGoals++;
        notifyObservers();
    }

    public void addGuestGoal() {
        guestGoals++;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
        observer.addFootballMatch(this);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
        observer.removeFootballMatch(this);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.updateScore(homeTeam, guestTeam, homeGoals, guestGoals);
        }
    }
}
