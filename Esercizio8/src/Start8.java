public class Start8 {
    public static void main(String[] args) {
        SqueakyClean es = new SqueakyClean();
        System.out.println("Scambiare gli spazi vuoti con il trattino basso: " + es.clean(" my   Id"));

        System.out.println("1) Sostituisci i caratteri di controllo con CTRL: " + es.clean("my\0Id"));
        System.out.println("2) Sostituisci i caratteri di controllo con CTRL: " + es.clean("my\0\r\u007FId"));

        System.out.println("Converti kebab-case in camelCase: " + es.clean("à-ḃç"));

        System.out.println("Ometti i caratteri che non sono lettere: " + es.clean("a1😀2😀3😀b"));

        System.out.println("Ometti le lettere minuscole greche: " + es.clean("MyΟβιεγτFinder"));

        System.out.println("Un mix di tutto: " + es.clean("9 -abcĐ\uD83D\uDE00ω\0"));

    }
}
