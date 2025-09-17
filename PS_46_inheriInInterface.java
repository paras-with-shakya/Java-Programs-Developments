interface sampleInterface {
    void math1();

    void math2();
}

interface childSampleInterface extends sampleInterface {
    void math3();

    void math4();
}

class MySampleClass implements childSampleInterface {

    public void math1() {
        System.out.println("This is a mathod Math1");
    }

    public void math2() {
        System.out.println("This is a mathod Math2");
    }

    public void math3() {
        System.out.println("This is a mathod Math3");
    }

    public void math4() {
        System.out.println("This is a mathod Math4");
    }
}

public class PS_46_inheriInInterface {
    public static void main(String[] args) {
        MySampleClass sm = new MySampleClass();
        sm.math1();
        sm.math2();
        sm.math3();
        sm.math4();

    }

}
