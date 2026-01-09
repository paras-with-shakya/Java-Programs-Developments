      
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
            System.out.println("I am Chatting!");
            i++;
        }
    }
}
public class PS_56_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 b1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(b1);
        MyThreadRunnable2 b2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(b2);

        gun1.start();
        gun2.start();
    }
}
