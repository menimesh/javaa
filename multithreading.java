class abc implements Runnable{
public void run()
{
    for(int i=1;i<10;i++)
    {
        if(i%2==0)
        {
            System.out.println(" "+i);
            try{
                Thread.sleep(2000);

            }
            catch(InterruptedException e){
                System.out.println("interputed");
            }
        }
    }
}
}




class multithreading {
    public static void main(String[] args) {
        abc ob=new abc();
        Thread t1=new Thread(ob);
        t1.start();
    
    }
    
}
