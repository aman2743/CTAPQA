package exceptionsInJavaCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExample1 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Test1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("File is found");

    }
}