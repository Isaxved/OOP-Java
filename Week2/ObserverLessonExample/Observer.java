package Week2.ObserverLessonExample;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
