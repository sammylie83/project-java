
/**
 *
 * @author Backend Dev
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CardShuffling {
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

        // Print the shuffled cards
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
