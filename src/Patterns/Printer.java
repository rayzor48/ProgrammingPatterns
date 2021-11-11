package Patterns;

public  class Printer {
    private PrintedComponent printedComponent;

    public Printer(PrintedComponent pc) {
        this.printedComponent = pc;
    }

    public void print(int fontSize, String fontStyle, String format, int resolution){
        printedComponent.print(fontSize, fontStyle, format, resolution);
    }
}
