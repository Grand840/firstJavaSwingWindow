package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MenuBarSample extends JFrame {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        MenuBarSample fen = new MenuBarSample();
        fen.setVisible(true);
    }
    public MenuBarSample(){
        super("JMenuBar Sample");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setJMenuBar(this.createMenuBar());
    }
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu mnuFile = new JMenu("File");
        mnuFile.setMnemonic('F');

        JMenuItem mnuNewFile = new JMenuItem("New File");
        mnuNewFile.setIcon(new ImageIcon("icons/new.png"));
        mnuNewFile.setMnemonic('N');
        mnuNewFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        mnuNewFile.addActionListener(this::mnuNewListener);
        mnuFile.add(mnuNewFile);

        mnuFile.addSeparator();

//        JMenuItem mnuOpenFile = new JMenuItem("Open File ...");

        return menuBar;
    }

    private void mnuNewListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "Button Clicked !");
    }

}
