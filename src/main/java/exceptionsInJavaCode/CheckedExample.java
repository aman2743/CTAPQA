package exceptionsInJavaCode;

import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        File file = new File("D:\\Test1.txt");
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            System.out.println("File is found");
        } catch (FileNotFoundException e) {
            {
                RuntimeException runtimeException = new RuntimeException(e);
                throw runtimeException;
            }

        }
    }
}