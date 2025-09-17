interface MyCamera {
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

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String Network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyCellPhone implements MyWifi, MyCamera {
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
}

public class PS_45_defultMethed {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        ms.record4KVideo();
        // ms.greet();--->Theows the error
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }

    }
}
