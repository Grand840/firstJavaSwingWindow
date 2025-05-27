package ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
public class JRadioButtons extends JFrame {

    JLabel lblMessage = new JLabel("Choisis ta couleur préférée");
    ButtonGroup buttonGroup = new ButtonGroup();

    JRadioButton rdoRed = new JRadioButton("Rouge");
    JRadioButton rdoGreen = new JRadioButton("Verte");
    JRadioButton rdoBlue = new JRadioButton("Bleue");

    JPanel pnlPreview = new JPanel();
    JButton btnQuit = new JButton("Quitter");

    public JRadioButtons() {
        super( "Exemple d'utilisation de la classe JRadioButton" );
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.add( lblMessage, BorderLayout.NORTH );
        JPanel pnlLeft = new JPanel( new GridLayout( 3, 1 ) );
        pnlLeft.setPreferredSize( new Dimension( 100, 0 ) );

        rdoRed.setSelected( true );
        pnlLeft.add( rdoRed );
        buttonGroup.add( rdoRed );
        rdoRed.addItemListener( this::radioButtons_itemStateChanged );

        pnlLeft.add( rdoGreen );
        buttonGroup.add( rdoGreen );
        rdoGreen.addItemListener( this::radioButtons_itemStateChanged );

        pnlLeft.add( rdoBlue );
        this.buttonGroup.add( rdoBlue );
        rdoBlue.addItemListener( this::radioButtons_itemStateChanged );

        contentPane.add( pnlLeft, BorderLayout.WEST );
        pnlPreview.setBackground(Color.red);

        contentPane.add( pnlPreview, BorderLayout.CENTER );
        btnQuit.addActionListener( (e) -> dispose() );

        contentPane.add( btnQuit, BorderLayout.SOUTH );
        this.setSize(300,160);
        this.setLocationRelativeTo( null );
    }

    private void radioButtons_itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == rdoRed) pnlPreview.setBackground(Color.red);
        if (source == rdoGreen) pnlPreview.setBackground(Color.green);
        if (source == rdoBlue) pnlPreview.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        JRadioButtons frame = new JRadioButtons();
        frame.setVisible( true );
    }
}