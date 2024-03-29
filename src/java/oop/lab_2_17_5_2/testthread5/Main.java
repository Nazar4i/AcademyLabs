package java.oop.lab_2_17_5_2.testthread5;


public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        Printer printer = new Printer(storage);
        Counter counter = new Counter(storage, printer);

        new Thread(counter).start();
        new Thread(printer).start();

    }

}
