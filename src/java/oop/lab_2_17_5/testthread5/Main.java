package java.oop.lab_2_17_5.testthread5;


public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        new Thread(counter).start();
        new Thread(printer).start();

    }

}
