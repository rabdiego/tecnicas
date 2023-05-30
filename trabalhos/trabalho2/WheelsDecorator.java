public class WheelsDecorator extends Decorator {
    public WheelsDecorator(VisualComponent vc) {
        super(vc);
    }

    public void draw() {
        super.draw();
        System.out.println("  \\/                \\/");
        System.out.println("  O                  O ");
    }
}