class Scrabble {
    String word;
    Scrabble(String word){
        this.word = word.toUpperCase();
    }

    int getValueLetter(char letter){
        switch (letter){
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'R': case 'S': case 'T': return 1;
            case 'D': case 'G': return 2;
            case 'B': case 'C': case 'M': case 'P': return 3;
            case 'F': case 'H': case 'V': case 'W': case 'Y': return 4;
            case 'K': return 5;
            case 'J': case 'X': return 8;
            case 'Q': case 'Z': return 10;
            default: return 0;
        }
    }

    int getScore() {
        char word[] = this.word.toCharArray();
        int value = 0;

        for(Character lettera : word){
            value += getValueLetter(lettera);
        }
        return value;
    }
}
