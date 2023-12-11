/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crudjava1;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import crudjava.view.FormUtama;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author bahrie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    FormUtama form = new FormUtama();
                    form.setLocationRelativeTo(null);
                    form.setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
