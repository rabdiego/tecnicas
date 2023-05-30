public class NetDecorator extends Decorator {
    public NetDecorator(VisualComponent vc) {
        super(vc);
    }

    public void draw() {
        System.out.println("           ##");
        System.out.println("           ##");
        super.draw();
    }
}