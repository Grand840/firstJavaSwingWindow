package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        super("my first Swing application ");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout());

        JButton btnPushMe = new JButton("Push me");
        contentPane.add(btnPushMe);

        JButton btnClickMe = new JButton("click me!!!!!");
        contentPane.add(btnClickMe);

        JCheckBox chkCheckMe = new JCheckBox("check me ");
        contentPane.add(chkCheckMe);

        JTextField txtEditMe = new JTextField("Edit me !");
        txtEditMe.setPreferredSize(new Dimension(120,30));
        contentPane.add(txtEditMe);

    }
    public static void main(String[] args) throws Exception{

        UIManager.setLookAndFeel( new NimbusLookAndFeel());

        MyWindow myWindow = new MyWindow();
        myWindow.setVisible(true);
    }

}