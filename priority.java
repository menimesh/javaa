 class a extends Thread{
    public void run(){
        System.out.println(getName());
    }
 }
 
 class priority  {
    public static void main(String[] args) {
        a t1=new a();
        a t2=new a();
        a t3=new a();
        t1.setName("THis will execute at last");
        t2.setName("THis will execute 2nd");
        t3.setName("This will execute at 1st");
        t3.setPriority(8);
        t2.setPriority(6);
        t1.setPriority(3);
        t3.start();
        t2.start();
        t1.start();
    }
}
