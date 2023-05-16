import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File f = new File("2.txt"); // create instance of class file no file created
        System.out.println(f.exists()); // false
        f.createNewFile(); // crete file 2.txt
        System.out.println(f.exists()); // true

        if (f.exists()){
            System.out.println("The name of file : "+f.getName());
            System.out.println("The absolute path of file : "+f.getAbsolutePath());
            System.out.println("The path of file from the project :  "+f.getPath());
            System.out.println("Writeable : "+f.canWrite());
            System.out.println("Readable : "+f.canRead());
            System.out.println("Can execute : "+f.canExecute());
            System.out.println("File size in bytes : "+f.length());
            System.out.println("Last modified : "+f.lastModified());
            System.out.println("Is directory :"+f.isDirectory());
            System.out.println("Is File : "+f.isFile());
          
            /*
            The name of file : 2.txt
            The absolute path of file : ~/IdeaProjects/FileHandling/2.txt
            The path of file from the project :  2.txt
            Writeable : true
            Readable : true
            Can execute : false
            File size in bytes : 0
            Last modified : 1684255887983
            Is directory :false
            Is File : true

            */
        }

    }

}
