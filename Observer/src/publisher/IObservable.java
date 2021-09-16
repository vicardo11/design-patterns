package publisher;

import listener.IObserver;

public interface IObservable {
    void addObserver(IObserver IObserver);
    void deleteObserver(IObserver IObserver);
    void notifyObservers();
}
