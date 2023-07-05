import java.awt.*;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Frame janela = new Frame("diego");
        janela.setSize(500, 500);
        Label label = new Label("DIEGO");
        Panel panel = new Panel();
        panel.add(label, BorderLayout.CENTER);
        janela.add(panel);
        janela.pack();
        janela.setVisible(true);
    }
}
