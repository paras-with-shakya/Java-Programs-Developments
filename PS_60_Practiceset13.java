
class Practice13 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Practice13b extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class PS_60_Practiceset13 {

    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println("Priority of p1 is: " + p1.getPriority());
        System.out.println("Priority of p2 is: " + p2.getPriority());
        System.out.println(p2.getState());

        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
