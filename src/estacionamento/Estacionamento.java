package estacionamento;

import estacionamento.view.FormPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new FormPrincipal().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Estacionamento.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
