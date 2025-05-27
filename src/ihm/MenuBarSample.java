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

        menuBar.add(mnuFile);

        JMenuItem mnuOpenFile = new JMenuItem("Open File ...");
        mnuOpenFile.setIcon(new ImageIcon("icons/open.png"));
        mnuOpenFile.setMnemonic(('O'));
        mnuOpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        mnuOpenFile.addActionListener(this::mnuOpenListener);
        mnuFile.add(mnuOpenFile);

        mnuFile.addSeparator();

        JMenuItem mnuSaveFile = new JMenuItem("Save File ...");
        mnuSaveFile.setIcon(new ImageIcon("icons/save.png"));
        mnuSaveFile.setMnemonic('S');
        mnuSaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        mnuSaveFile.addActionListener(this::mnuSaveListener);
        mnuFile.add(mnuSaveFile);

        mnuFile.addSeparator();

        JMenuItem mnuSaveFileAs = new JMenuItem("Save File As ...");
        mnuSaveFileAs.setIcon(new ImageIcon("icons/save_as.png"));
        mnuSaveFileAs.setMnemonic('A');
        mnuSaveFileAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SHIFT, KeyEvent.CTRL_DOWN_MASK));
        mnuSaveFileAs.addActionListener(this::mnuSaveAsListener);
        mnuFile.add(mnuSaveFileAs);

        mnuFile.addSeparator();

        JMenuItem mnuExit = new JMenuItem("Exit");
        mnuExit.setIcon(new ImageIcon("icons/exit.png"));
        mnuExit.setMnemonic('X');
        mnuExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));
        mnuExit.addActionListener(this::mnuExitListener);
        mnuFile.add(mnuExit);

        mnuFile.addSeparator();
        return menuBar;
    }

    private void mnuNewListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "Button Clicked !");
    }

    private void mnuOpenListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "Open File Success !");
    }

    private void mnuSaveListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "File Save Successful !");
    }

    private void mnuSaveAsListener(ActionEvent event) {
        JOptionPane.showMessageDialog(this, "Save File As ... !");
    }

    private void mnuExitListener(ActionEvent event) {
        System.exit(0);
    }


}
