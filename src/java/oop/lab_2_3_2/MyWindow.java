package java.oop.lab_2_3_2;


public class MyWindow {

    public static final double DEFAULT_WIDTH = 1;
    public static final double DEFAULT_HEIGHT = 1;
    public static final int DEFAULT_NUMBER_OF_GLASS = 1;
    public static final String DEFAULT_COLOR = "white";
    public static final boolean DEFAULT_IS_OPEN = false;

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
        this.numberOfGlass = DEFAULT_NUMBER_OF_GLASS;
        this.color = DEFAULT_COLOR;
        this.isOpen = DEFAULT_IS_OPEN;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
    }

}
