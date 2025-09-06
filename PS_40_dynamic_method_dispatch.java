class Phone {
    public void showTime() {
        System.out.println("Time is 9 AM");
    }

    public void on() {
        System.out.println("Turning on the phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on the smartphone...");
    }
}

public class PS_40_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();// allowed
        // SmartPhone smobj = new SmartPhone();// allowed
        // obj.great();
        // smobj.name();
        Phone og = new SmartPhone();// yes It is allowed
        // SmartPhone og = new Phone();//No It is not allowed
        og.showTime();
        og.on();
        // og.music();// Not allowed
    }
}