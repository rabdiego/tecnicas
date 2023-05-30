public class Window {
    private VisualComponent contents;

    public void setContents(VisualComponent vc) {
        contents = vc;
    }

    public void draw() {
        contents.draw();
    }
}