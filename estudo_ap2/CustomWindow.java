import java.awt.*;

public class CustomWindow extends Frame{
    public CustomWindow(String label) {
        super(label);
        Panel panel = new Panel();
        this.add(panel);
        this.setSize(1500, 1500);
        this.setBackground(Color.blue);
    }

    public void mostrar() {
        this.pack();
        this.setVisible(true);
    }
}
