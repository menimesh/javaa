
class hello{
    int id;
    String Name;
    String Address;
    void div(String a,String b, int c)
    {
        id=c;
        Name=a;
        Address=b;

    }
    void show()
    {
System.out.println("Name: "+Name+" Address "+Address+" Id: "+id);
    }}
    class hi extends hello{
        long number;
       
        void ul(String a,String b, int c,long n)
        { 
          
            div(a,b,c);
            number=n;
            display();
        }
        void display()
        {
            show();
            System.out.println("Number:-"+number);
            
        }
        
    }


public class inheritance {
    public static void main(String[] args) {
      

    
        hi ob []=new hi[3];
        for(int i=0;i<3;i++)
        {
            ob [i]=new hi();
        }
        ob[0].ul("nimesh","jhapa",5,9825952054l);
        ob[1].ul("nimeshs","Jjhapa",52,982595054l);
        ob[2].ul("nimeshhh","jhapaaa",5,982592054l);
     

      

       
        
    }
    
}
