package Week2.ObserverLessonExample;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}
