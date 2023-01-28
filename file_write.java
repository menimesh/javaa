import java.io.*;
import java.util.Scanner;
class file_write {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        FileWriter ok=new FileWriter("/home/menimesh/Desktop/Nimeshh.txt");
        System.out.println("Enter what you want to store");
    String a=sc.nextLine();
        ok.write(a);
        ok.close();
       File read=new File("/home/menimesh/Desktop/Nimeshh.txt");
       Scanner hi=new Scanner(read);
       while(hi.hasNextLine())
       {
System.out.println(sc.nextLine());
       }
hi.close();
        sc.close();
        System.out.println("File write sucessfully");
        
    }
}
