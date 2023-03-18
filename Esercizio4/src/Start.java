public class Start {
    public static void main(String[] args) {
        MicroBlog microBlog = new MicroBlog();
        System.out.println(microBlog.truncate("Facile"));
        System.out.println("-------------");
        System.out.println(microBlog.truncate("Casa"));
        System.out.println("-------------");
        System.out.println(microBlog.truncate2("Esercizio"));
        System.out.println("-------------");
        System.out.println(microBlog.truncate2("Buio"));
    }
}
