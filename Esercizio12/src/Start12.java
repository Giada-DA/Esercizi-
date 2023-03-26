import java.util.Arrays;

public class Start12 {
    public static void main(String[] args) {

        ResistorColor es = new ResistorColor();

        System.out.println("Il numero associato al giallo è: " + es.colorCode("giallo"));
        System.out.println("Il numero associato al blu è: " + es.colorCode("blu"));
        System.out.println("Il numero associato al rosso è: " + es.colorCode("rosso"));

        System.out.println("I colori sono: " + Arrays.toString(es.colors()));
    }
}
