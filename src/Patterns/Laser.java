package Patterns;

public class Laser extends PrintedComponent{
    @Override
    public void print(int fontSize, String fontStyle, String format, int resolution) {
        System.out.println(this.getClass().getName() + " dit print with fontSize " + fontSize + ", format " + format +  " and resolution " + resolution/2 );
    }
}
