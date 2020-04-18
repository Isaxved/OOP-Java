package Week2.ObserverLessonExample;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear," + name + "We have changes");
        for (String element: vacancies) {
            System.out.println(element);
        }
    }
}
