package estacionamento.util;

import estacionamento.view.FormPrincipal;
import java.awt.Component;
import javax.swing.JFrame;

public class Util {
    public static FormPrincipal getFormPrincipal(Component c){
        while(!(c instanceof  JFrame)){
            c = c.getParent();
        }
        return (FormPrincipal) c;
    }
}