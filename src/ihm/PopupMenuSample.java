package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PopupMenuSample extends JFrame {

    public PopupMenuSample() {
        super( "JPopupMenu sample" );
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        JPanel contentPane = (JPanel) getContentPane();

        JScrollPane leftScrollPane = new JScrollPane( new JTree() );
        leftScrollPane.setPreferredSize( new Dimension( 200, 0 ) );
        JTextArea textArea = new JTextArea();
        JScrollPane rightScrollPane = new JScrollPane( textArea );
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT, leftScrollPane, rightScrollPane );
        contentPane.add( splitPane /*, BorderLayout.CENTER */ );

        JPopupMenu popupMenu = this.createPopupMenu();
        textArea.addMouseListener( new MouseAdapter() {
@Override public void mousePressed( MouseEvent event ) {
                if ( event.isPopupTrigger() ) {
                    System.out.println( "Show popup" );
                    popupMenu.show( event.getComponent(), event.getX(), event.getY() );
                }
            }
        } );
    }

    private JPopupMenu createPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem mnuUndo = new JMenuItem( "Undo" );
        mnuUndo.setIcon( new ImageIcon( "icons/undo.png" ) );
        mnuUndo.setMnemonic( 'U' );
        mnuUndo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK) );
        mnuUndo.addActionListener( this::mnuUndoListener );
        popupMenu.add(mnuUndo);

        JMenuItem mnuRedo = new JMenuItem( "Redo" );
        mnuRedo.setIcon( new ImageIcon( "icons/redo.png" ) );
        mnuRedo.setMnemonic( 'R' );
        mnuRedo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK) );
        popupMenu.add(mnuRedo);
        popupMenu.addSeparator();

        JMenuItem mnuCopy = new JMenuItem( "Copy" );
        mnuCopy.setIcon( new ImageIcon( "icons/copy.png" ) );
        mnuCopy.setMnemonic( 'C' );
        mnuCopy.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK) );
        popupMenu.add(mnuCopy);

        JMenuItem mnuCut = new JMenuItem( "Cut" );
        mnuCut.setIcon( new ImageIcon( "icons/cut.png" ) );
        mnuCut.setMnemonic( 't' );
        mnuCut.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK) );
        popupMenu.add(mnuCut);

        JMenuItem mnuPaste = new JMenuItem( "Paste" );
        mnuPaste.setIcon( new ImageIcon( "icons/paste.png" ) );
        mnuPaste.setMnemonic( 'P' );
        mnuPaste.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK) );
        popupMenu.add(mnuPaste);

        return popupMenu;
    }
    private void mnuUndoListener(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog( this, "Undo!" );
    }
public static void main(String[] args) throws Exception {
    UIManager.setLookAndFeel(new NimbusLookAndFeel());
    PopupMenuSample frame = new PopupMenuSample();
    frame.setVisible(true);
}
}