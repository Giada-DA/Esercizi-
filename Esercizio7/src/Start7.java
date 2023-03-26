public class Start7 {
    public static void main(String[] args) {
        Blackjack gioco = new Blackjack();

        System.out.println("Valore della carta: " + gioco.parseCard("five"));

        System.out.println("La somma delle carte fa BalckJack? " + gioco.isBlackjack("ace", "ten"));
        System.out.println("La somma delle carte fa BalckJack? " + gioco.isBlackjack("ace", "two"));

        System.out.println("Mano superiore a 20 punti, che risultato avrò? " + gioco.firstTurn("ace", "jack", "two"));

        System.out.println("Mano inferiore a 20 punti, che risultato avrò? " + gioco.firstTurn("five", "ten", "six"));

    }
}
