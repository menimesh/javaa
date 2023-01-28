public class palindrome {
    public static void main(String[] args) {
        int a,sum=0,temp,b;
        a=123;
        temp=a;
        while(a>0){
            b=a/10;
            sum=(sum*10)+b;
            a=a/10;
        }
        if(temp==a)
            System.out.println("Palindrome");
            else
            System.out.println("Not palindrome");
            
        
    }
}
