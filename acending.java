import java.util.Arrays;
import java.util.Scanner;
public class acending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ab[]=new String [5];
        int i;
        for(i=0;i<5;i++){
            ab[i]=sc.nextLine();
        }
        Arrays.sort(ab);
        System.out.println(" "+Arrays.toString(ab));
    }
    
}
