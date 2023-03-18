import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class MicroBlog {
    public String truncate(String input) {
        int count = input.codePointCount(0, input.length());
        return input.substring(0, input.offsetByCodePoints(0, Math.min(count, 5)));
    }
    public String truncate2(String input) {
        return input.length() > 5 ? input.substring(0,input.offsetByCodePoints(0,5)) : input;
    }

}
