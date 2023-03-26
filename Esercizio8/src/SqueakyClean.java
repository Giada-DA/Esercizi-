import java.util.regex.Pattern;

class SqueakyClean {
        static String clean(String identifier) {
            StringBuilder str = new StringBuilder();
            boolean camelCase = false;
            for (int i = 0; i<identifier.length(); i++){
                char ch = identifier.charAt(i);
                if (ch == ' '){
                    str.append("_");
                }else if(Character.isISOControl(ch)){
                    str.append("CTRL");
                }else if(ch == '-'){
                    camelCase = true;
                } else if (!Character.isLetter(ch)) {
                    
                } else if ((int) ch >= 945 && (int) ch <= 969) {
                    
                } else if (camelCase) {
                    str.append(Character.toUpperCase(ch));
                    camelCase = false;
                }else str.append(ch);
            }
            return str.toString();
        }
}
