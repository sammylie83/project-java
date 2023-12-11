

/**
 *
 * @author Backend Dev
 */
public class CardGameEvaluator {
    public static void main(String[] args) {
        // Define the cards held by Player 1 and Player 2
        String[] player1Cards = {"K@", "K#", "K*"};
        String[] player2Cards = {"A@", "A#", "A^"};

        // Evaluate the winner
        String winner = evaluateWinner(player1Cards, player2Cards);

        // Display the result
        System.out.println("Winner: Player " + winner);
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
                if (player1Cards[i].compareTo(player2Cards[i]) > 0) {
                    return "1";
                } else if (player2Cards[i].compareTo(player1Cards[i]) > 0) {
                    return "2";
                }
            }
            // If there's a tie, Player 1 is declared the winner (you can change this if needed)
            return "1";
        }
    }
}
