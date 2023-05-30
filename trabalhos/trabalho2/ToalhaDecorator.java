public class ToalhaDecorator extends Decorator {
    public ToalhaDecorator(VisualComponent vc) {
        super(vc);
    }

    public void draw() {
        System.out.println("========================");
        super.draw();
    }
}