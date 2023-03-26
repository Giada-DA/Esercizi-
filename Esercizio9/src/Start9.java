import java.util.Arrays;

public class Start9 {
    public static void main(String[] args) {
        BirdWatcher es = new BirdWatcher(new int[]{0, 2, 5, 3, 7, 8, 4});

        System.out.println("Conteggi settimana scorsa: " + Arrays.toString(es.getLastWeek()));

        System.out.println("Quanti pennuti hanno fatto visita oggi: " + es.getToday());

        es.incrementTodaysCount();

        System.out.println("C'è stato un giorno senza visite? " + es.hasDayWithoutBirds());

        System.out.println("Quante visite nei primi 4 giorni? " + es.getCountForFirstDays(4));

        System.out.println("Giorni con maggiori visite: " + es.getBusyDays());



    }
}
