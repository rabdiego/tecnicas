public class Main {
    public static void main(String[] args) {
        // copia e cola no terminal os comandos do make.txt pra compilar todos os arquivos
        Window w = new Window();
        w.setContents(new NetDecorator(new WheelsDecorator(new Table())));
        w.draw();
    }
}