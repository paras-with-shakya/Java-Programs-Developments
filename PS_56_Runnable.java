
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("My Runnable Thread 1 is running");
            System.out.println("I am enjoying Runnable!");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("My Runnable Thread 2 is running");
            System.out.println("I am enjoying Runnable!");
            i++;
        }
    }
}



public class PS_56_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 r1 = new MyThreadRunnable1();
        MyThreadRunnable2 r2 = new MyThreadRunnable2();

        Thread t1 = new Thread(r1);
         
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        

    }
}
