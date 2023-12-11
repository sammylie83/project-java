

/**
 *
 * @author Backend Dev
 */
public class CardGameEvaluatorWinningResult {
      public static void main(String[] args) {
        // Define the cards held by Player 1 and Player 2
        String[] player1Cards = {"K@", "K#", "K*"};
        String[] player2Cards = {"A@", "A#", "A^"};

        // Evaluate the winner
        String winner = evaluateWinner(player1Cards, player2Cards);

        // Display the result
        if (winner.equals("1")) {
            System.out.println("Winner: Player 1");
        } else if (winner.equals("2")) {
            System.out.println("Winner: Player 2");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Function to evaluate the winner
    public static String evaluateWinner(String[] player1Cards, String[] player2Cards) {
        int player1Count = player1Cards.length;
        int player2Count = player2Cards.length;

        // Compare the number of winning cards
        if (player1Count > player2Count) {
            return "1";
        } else if (player2Count > player1Count) {
            return "2";
        } else {
            // If both players have the same number of winning cards, compare the alphanumeric and symbol parts
            for (int i = 0; i < player1Count; i++) {
                if (compareCards(player1Cards[i], player2Cards[i]) == 1) {
                    return "1";
                } else if (compareCards(player1Cards[i], player2Cards[i]) == -1) {
                    return "2";
                }
            }
            // If there's a tie, return "0"
            return "0";
        }
    }

    // Function to compare cards based on alphanumeric and symbol values
    public static int compareCards(String card1, String card2) {
        String alphanumeric1 = card1.substring(0, 1);
        String alphanumeric2 = card2.substring(0, 1);
        String symbol1 = card1.substring(1);
        String symbol2 = card2.substring(1);

        // Compare alphanumeric parts
        int alphanumericComparison = alphanumeric1.compareTo(alphanumeric2);

        if (alphanumericComparison > 0) {
            return 1;
        } else if (alphanumericComparison < 0) {
            return -1;
        } else {
            // If alphanumeric parts are the same, compare symbol parts
            return symbol1.compareTo(symbol2);
        }
    }
}
