package swe_132_java_file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_Input_output_3 {
    public static void main(String[] args) {
        Double sum = 0.0;
        String str;
        try {
            String id, name, java, algo, db;
            File f = new File("Exam.txt");
            try (FileWriter fw = new FileWriter(f)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter ID:");
                id = input.nextLine();
                fw.write(id+"\r\n" );
                System.out.println("Name:");
                name = input.nextLine();
                fw.write(name+"\r\n" );
                System.out.println("Marks in java:");
                java = input.nextLine();
                System.out.println("Marks in Algorith:");
                algo = input.nextLine();
                System.out.println("Marks in ");
                db = input.nextLine();
                fw.write(java+"#"+algo+"#"+db);
                fw.close();
            }
        }catch (IOException e) {
            System.out.println(".........");
        }
        try {
            File f = new File("Exam.txt");
            Scanner s1;
            s1 = new Scanner(f);
            System.out.println( s1.nextLine());
            System.out.println( s1.nextLine());
            str = s1.nextLine();
            String[] parts = str.split("#");
            for (int i = 0; i < parts.length; i++) {
                sum+=Integer.parseInt(parts[i]);
            }
            System.out.println("sum is: "+sum);
            System.out.println("Average:" + sum / parts.length);
        } catch (FileNotFoundException e) {
            System.out.println("File not fount");
        }
    }
}
