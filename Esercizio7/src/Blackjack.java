public class Blackjack {

    public int parseCard(String card) {
        switch (card){
            case "ace": return 11;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            case "ten": case "jack": case "queen": case "king": return 10;
            default: return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        int firstCard = parseCard(card1);
        int secondCard = parseCard(card2);
        if ((firstCard + secondCard) == 21 ){
            return true;
        }else return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore < 10) {
                return "Hai vinto! (W)";
            } else return "Stai (S)";
        }else return "Separa gli assi (P)";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "Stai (S)";
        } else if (handScore <= 11) {
            return "Hai vinto! (W)";
        } else if (dealerScore < 7) {
                return"Stai (S)";
        } else return "Hai vinto! (W)";
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
