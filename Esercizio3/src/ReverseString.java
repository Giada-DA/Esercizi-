class ReverseString {

    public String reverse(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        inputString = str.reverse().toString();
        return inputString;
    }

}
