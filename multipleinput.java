
import java.util.Scanner;
public class multipleinput{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scan.nextInt();
        int [] array=new int[size];
        String []hello= new String[size];
        

        for(int i=0;i<size;i++)
        {
             System.out.println("Enter the element");
             array[i]=scan.nextInt();
             System.out.println(" ENter string");
             hello[i]=scan.nextLine();

        } 
        scan.close(); 
        for(int i=0;i<array.length;i++)
        {
           System.out.println(array[i]); 
           System.out.println(hello[i]); 
        }
    }
} 