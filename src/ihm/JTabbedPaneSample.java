package ihm;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class JTabbedPaneSample extends JFrame {
    public JTabbedPaneSample() throws Exception {
        super("JTabbedPane Sample");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setPreferredSize(new Dimension(260, 0));
        tabs.setTabPlacement(JTabbedPane.BOTTOM);

        tabs.addTab("Explorer", new JScrollPane(new JTree()));

        JEditorPane helpPane = new JEditorPane();
        helpPane.setEditable(false);
        helpPane.setPage("file:docs/index.html");
        tabs.addTab("Help", new JScrollPane(helpPane));

        JTextArea editor = new JTextArea();
        JScrollPane scrollEditor = new JScrollPane(editor);

        JSplitPane splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tabs, scrollEditor);

        JPanel contentPane = (JPanel)getContentPane();
        contentPane.add(splitter, BorderLayout.CENTER);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        JTabbedPaneSample frame = new JTabbedPaneSample();
        frame.setVisible(true);
    }
}
