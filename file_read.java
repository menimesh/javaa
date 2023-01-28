import java.util.Scanner;
import java.io.*;
public class file_read {
    public static void main(String[] args)throws IOException {
        Scanner c=new Scanner(System.in);
        FileWriter ok=new FileWriter("Nimesh.txt");
        System.out.println("Enter what you want to store");
    
        ok.write(c.nextLine());

ok.close();
c.close();
        FileReader hi=new FileReader("Nimesh.txt");
        Scanner sc=new Scanner(hi);
       while(sc.hasNextLine()){
    
     
System.out.println(sc.nextLine());
       }
       sc.close();
      hi.close();
        }
    }
    

