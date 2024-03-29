package java.se.lab_1_2_2;

import java.io.*;


public class DeserializeDemo {

    public static void main(String[] args) {

        File file = new File("./employee.ser");
        try(FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis)) {
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
