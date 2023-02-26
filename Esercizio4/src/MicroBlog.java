import java.nio.charset.StandardCharsets;

class MicroBlog {
    public String truncate(String input) {
        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
        if(bytes <= 5){
            System.out.println("Ok");
        }else if(bytes > 5)
            System.out.println(input.substring(5));
    }
}
fuslonfx24.com giulia