package java.oop.lab_2_17_5.testthread5;

public class Printer implements Runnable {

    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        do {
            synchronized (storage) {
                while (!storage.isReady()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(storage.getI());
                storage.setReady(false);
            }
        } while (storage.getI() != 10);
    }


}
