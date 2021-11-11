package Patterns;

public abstract class PrintedComponent {
    public void print (int fontSize, String fontStyle, String format, int resolution){
        System.out.println(getClass() + " did print some letter with default parameters");
    }
}
