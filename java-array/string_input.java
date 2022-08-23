import java.util.Scanner;
class string_input {
    public static void main(String[] args) {
        int l;
        Scanner input=new Scanner(System.in);
        System.out.println("Ener how many names do you want to enter");
        l= input.nextInt();
        String[] names = new String[l];
        for(int i=0;i<l;i++){
            System.out.println("ENter a name");
            names[l]=input.next();
        }
        input.close();
         for(int i=0;i<l;i++)
         {
          System.out.println(names[l]);
         }
    }
    
}