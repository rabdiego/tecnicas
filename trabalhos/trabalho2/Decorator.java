public class Decorator implements VisualComponent {
    protected VisualComponent vc;

    public Decorator(VisualComponent vc) {
        this.vc = vc;
    }

    public void draw() {
        vc.draw();
    }
}