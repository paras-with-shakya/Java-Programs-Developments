interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("record4KVideo...");
    }
}

interface MyWifi2 {
    String[] getNetwork();

    void connectToNetwork(String Network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class MySmartphone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    public void record4KVideo() {
        System.out.println("Taking Snap 4K Video...");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Paras", "Aranav", "Aman", "Arun" };
        return networkList;
    }

    public void connectToNetwork(String Network) {
        System.out.println("Connecting to " + Network);
    }

    public void samplemath() {
        System.out.println("This is a sample mathod");
    }
}

public class PS_49_polymorphism_interface {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartphone2(); // This is a smartphone but use it as a camera
        // cam1.getNetwork();--->This will throw an error
        cam1.record4KVideo();
        cam1.takeSnap();
        cam1.recordVideo();
        MySmartphone2 sm = new MySmartphone2();
        // sm.samplemath();
        sm.callNumber(123456);
        sm.pickcall();
        String[] ar = sm.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }

    }
}
