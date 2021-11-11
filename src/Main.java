import Patterns.Laser;
import Patterns.Matrix;
import Patterns.Plotter;
import Patterns.Printer;

class Main{
    public static void main(String[] args) {
        Printer [] printers = {new Printer(new Laser()), new Printer(new Plotter()), new Printer(new Matrix()) };

        for (Printer p : printers) {
            p.print(11, "TimesNewRoman", "Center", 300);
        }
    }
}