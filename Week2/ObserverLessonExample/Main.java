package Week2.ObserverLessonExample;

public class Main {
    public static void main(String[] args) {

        JobMagazine headHunter = new JobMagazine();
        headHunter.addVacancy("Back-end developer");
        headHunter.addVacancy("Front-end developer");
        headHunter.addVacancy("Data science developer");

        Subscriber alisher = new Subscriber("Alisher");
        Subscriber venera = new Subscriber("Venera");

        headHunter.addObserver(alisher);
        headHunter.addObserver(venera);

        headHunter.addVacancy("Golang junior dev");
        headHunter.removeObserver(alisher);
        headHunter.removeVacancy("Golang junior dev");
        

    }
}
