class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("-", "").replaceAll(" ", "").toLowerCase();
        if (phrase.chars().distinct().count() == phrase.length()){
            return true;
        } else {
            return false;
        }
    }
}
