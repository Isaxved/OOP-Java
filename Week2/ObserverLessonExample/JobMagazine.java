package Week2.ObserverLessonExample;

import java.util.ArrayList;
import java.util.List;

public class JobMagazine implements Subject{

    private List<Observer> subscribers;
    private List<String> vacancies;

    public JobMagazine() {
        subscribers = new ArrayList<>();
        vacancies = new ArrayList<>();
    }

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyAllObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
