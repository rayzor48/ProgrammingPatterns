package Patterns;

public class Plotter extends PrintedComponent{
    @Override
    public void print(int fontSize, String fontStyle, String format, int resolution) {
        System.out.println(this.getClass().getName() + " dit print with fontSize " + fontSize + " and resolution " + resolution);
    }
}
