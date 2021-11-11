package Patterns;

public class Matrix extends PrintedComponent{
    @Override
    public void print(int fontSize, String fontStyle, String format, int resolution) {
        System.out.println(this.getClass().getName() + " dit print with standarts fontSize and low-resolution ");
    }
}
