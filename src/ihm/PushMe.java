package ihm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PushMe implements ActionListener {
    static public void main(String argv[]){
        new PushMe();
    }
    public PushMe(){
        Frame f  = new Frame("Ma Fenêtre");
        Button b = new Button("Push Me");
        b.addActionListener(this);

        f.add(b);
        f.pack();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Bouton" + event.getSource() + "Cliqué !");
    }
}
