package java.oop.lab_2_11.lab_2_11_4;


public interface Drawable {

    void draw();

    /*default void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea()); // interface have no idea that implementor will have calcArea() :(
    }*/

}
