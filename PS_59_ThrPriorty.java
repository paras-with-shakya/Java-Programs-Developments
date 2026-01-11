class ThreadPriority1 extends Thread{
    public ThreadPriority1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("The thread name is: " + getName());
            System.out.println("The thread priority is: " + getPriority());
            i++;
        }
        
    }
}



public class PS_59_ThrPriorty {
    public static void main(String[] args) {
        ThreadPriority1 t1 = new ThreadPriority1("Paras");
        ThreadPriority1 t2 = new ThreadPriority1("Rahul");
        ThreadPriority1 t3 = new ThreadPriority1("Suresh");
        ThreadPriority1 t4 = new ThreadPriority1("Vikas");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.NORM_PRIORITY); // 5
        t4.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
