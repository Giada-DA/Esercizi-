public class Start10 {
    public static void main(String[] args) {

        IsogramChecker es = new IsogramChecker();

        System.out.println("Isogramma: parola, o frase, che non contiene lettere ripetute.");
        System.out.println("'Cane' è un isogramma? " + es.isIsogram("cane"));

        System.out.println("'Gatto' è un isogramma? " + es.isIsogram("gatto"));

        System.out.println("'Yogurt' è un isogramma? " + es.isIsogram("yogurt"));

        System.out.println("'Spin-of' è un isogramma? " + es.isIsogram("spin-of"));

        System.out.println("'Si e no' è un isogramma? " + es.isIsogram("si e no"));
    }
}
