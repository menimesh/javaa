class overloading{
    static void BIM(int ...i)
    {
     System.out.println("Elements:");
     for(int l:i)
    
     {
System.out.println(l+" ");
     }
     System.out.println();

    }
    static void BIM(String s, int ...n)
    {

System.out.println(s+"Elements:");
for(int i : n)
{
    System.out.println(i+" ");
}
System.out.println();
    }
     public static void main(String[] args) {
    BIM("NOOR ",36,35,31);
    BIM();
    BIM("hansome ");
    }
}
