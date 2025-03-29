package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutSample extends JFrame implements ActionListener {
    public BorderLayoutSample(){
        super("BorderLayout sample");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel pnlMain = (JPanel) this.getContentPane();
        pnlMain.setLayout(new BorderLayout());

        JToolBar toolbar = new JToolBar();
        toolbar.add(new JButton("First"));
        toolbar.add(new JButton("Second"));
        toolbar.add(new JButton("Third"));

        pnlMain.add(toolbar, BorderLayout.NORTH);
        pnlMain.add(new JTree(), BorderLayout.WEST);
        pnlMain.add(new JTextArea(), BorderLayout.CENTER);
        pnlMain.add(new JTree(), BorderLayout.EAST);
        pnlMain.add(new JLabel("Status bar"), BorderLayout.SOUTH);

        this.setSize(500, 360);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)  {

}

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new BorderLayoutSample().setVisible(true);
    }
    }
