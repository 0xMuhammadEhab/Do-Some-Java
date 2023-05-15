import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileInputStream fis = new FileInputStream("1.txt");
        System.out.println(fis.read()); // method read return the first byte in the file with data type integer
        // 97
        System.out.println((char)fis.read()); // print the second byte in the file with casting to character
        // b
        System.out.println((char)fis.read());
        // c
        System.out.println((char)fis.read()); // print ? as there is a casting to -1
        // ?

//        // loop over the bytes in the file comment code at the top as the it reach the end of text
//        int data ;
//        while((data = fis.read()) != -1 ) System.out.println((char) data);

        // can read in an array of byte
        FileInputStream fis1 = new FileInputStream("1.txt");
        byte[] b = new byte[3];
        fis1.read(b);
        System.out.println(b[0]);
        // 97
        System.out.println((char)b[1]);
        // b

        // make it more dynamic
        File f = new File("1.txt");
        FileInputStream fis2 = new FileInputStream(f);
        byte[] b1 = new byte[(int)f.length()];  // f.length() return long datatype
        fis2.read(b1);
        String s = new String(b1);
        System.out.println(s);
        // abc
        fis.close();

    }

}
