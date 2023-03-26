public class Start5 {
    public static void main(String[] args) {
        LogLevels prova = new LogLevels();
        System.out.println(prova.message("[WARNING]: Invalid operation "));

        System.out.println(prova.logLevel("[ERROR]: Invalid operation"));

        System.out.println(prova.reformat("[INFO]: Operation completed"));
    }
}
