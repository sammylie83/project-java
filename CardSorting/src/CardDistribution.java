
/**
 *
 * @author Backend Dev
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CardDistribution {
     public static void main(String[] args) {
        // Create a list of cards
        List<String> cards = new ArrayList<>();
        cards.add("2@");
        cards.add("2#");
        cards.add("2^");
        cards.add("2*");  
        cards.add("3@");
        cards.add("3#");
        cards.add("3^");
        cards.add("3*");
        cards.add("4@");
        cards.add("4#");
        cards.add("4^");
        cards.add("4*"); 
        cards.add("5@");
        cards.add("5#");
        cards.add("5^");
        cards.add("5*");
        cards.add("6@");
        cards.add("6#");
        cards.add("6^");
        cards.add("6*");
        cards.add("6@");
        cards.add("6#");
        cards.add("6^");
        cards.add("6*");
        cards.add("7@");
        cards.add("7#");
        cards.add("7^");
        cards.add("7*");
        cards.add("8@");
        cards.add("8#");
        cards.add("8^");
        cards.add("8*");
        cards.add("9@");
        cards.add("9#");
        cards.add("9^");
        cards.add("9*");
        cards.add("10@");
        cards.add("10#");
        cards.add("10^");
        cards.add("10*");
        cards.add("J@");
        cards.add("J#");
        cards.add("J^");
        cards.add("J*");
        cards.add("Q@");
        cards.add("Q#");
        cards.add("Q^");
        cards.add("Q*");
        cards.add("K@");
        cards.add("K#");
        cards.add("K^");
        cards.add("K*");
        cards.add("A@");
        cards.add("A#");
        cards.add("A^");
        cards.add("A*");
        // Add the remaining cards here...

        // Shuffle the list to randomize the cards
        Collections.shuffle(cards);

        // Create lists for each player
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> player4 = new ArrayList<>();

        // Distribute 13 cards to each player
        for (int i = 0; i < 13; i++) {
            player1.add(cards.get(i));
            player2.add(cards.get(i + 13));
            player3.add(cards.get(i + 26));
            player4.add(cards.get(i + 39));
        }

        // Display the cards for each player
        System.out.println("Player 1's Cards: " + player1);
        System.out.println("Player 2's Cards: " + player2);
        System.out.println("Player 3's Cards: " + player3);
        System.out.println("Player 4's Cards: " + player4);
    }
}
