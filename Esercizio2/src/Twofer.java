public class Twofer {
    /*
    Deve stampare "One for Caronte, one for me." se è presnte un nome
    Deve stampare "One for you, one for me." se non è presente un nome
     */
    public String twofer(String name) {
        return String.format("One for %s, one for me.", name == null ? "you" : name);
    }
}
