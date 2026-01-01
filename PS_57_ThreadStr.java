class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i =0;
        while(i<2){
            System.out.println("Thre is my Thread");
            i++;
        }
    }
}

public class PS_57_ThreadStr {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Paras Shakya");
        t1.start();
        System.out.println("The name of my thread is: " + t1.getId());
        System.out.println("The name of the threadis: " + t1.getName());
        
    }
    
}
