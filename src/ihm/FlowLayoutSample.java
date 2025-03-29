package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutSample extends JFrame implements ActionListener {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private JButton btnLeft = new JButton("Set to left alignement");
        private JButton btnCenter = new JButton("Set to center alignement");
        private JButton btnRight = new JButton("Set to right alignement");
        private JPanel pnlMain = null;

        public FlowLayoutSample() {
            super("FlowLayout Sample");
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            pnlMain = (JPanel) this.getContentPane();
            pnlMain.setLayout(new FlowLayout(FlowLayout.CENTER));

            this.btnLeft.addActionListener(this);
            pnlMain.add(this.btnLeft);

            this.btnCenter.addActionListener(this);
            pnlMain.add(this.btnCenter);

            this.btnRight.addActionListener(this);
            pnlMain.add(this.btnRight);

            this.setSize(300, 200);
            this.setLocationRelativeTo(null);
        }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() == btnLeft) {
                this.pnlMain.setLayout(new FlowLayout(FlowLayout.LEFT));
            } else if (actionEvent.getSource() == btnCenter) {
                this.pnlMain.setLayout(new FlowLayout(FlowLayout.CENTER));
            } else {
                this.pnlMain.setLayout(new FlowLayout(FlowLayout.RIGHT));
            }

            this.pnlMain.revalidate();
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        new FlowLayoutSample().setVisible(true);
    }
}

