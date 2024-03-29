package java.se.lab_1_1;

import java.io.*;


public class Cat {

    public static void main(String[] args) {

        if (args.length == 1) {
            File file = new File(args[0]);
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                while (bufferedReader.ready()) {
                    System.out.println(bufferedReader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid args, path with filename is expected");
        }

    }

}
