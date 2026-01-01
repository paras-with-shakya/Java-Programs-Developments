interface SempleInterface {
    void math1();

    void math2();
}

interface childSampleInterface extends SempleInterface {

    void math3();

    void math4();
}

class MyMainClass implements childSampleInterface {

    @Override
    public void math1() {
        System.out.println("This is a mathod Math1");
    }

    @Override
    public void math2() {
        System.out.println("This is a mathod Math2");
    }

    @Override
    public void math3() {
        System.out.println("This is a mathod Math3");
    }

    @Override
    public void math4() {
        System.out.println("This is a mathod Math4");
    }
}

public class PS_48_Inheritance_Interfaces {
    public static void main(String[] args) {
        MyMainClass sm = new MyMainClass();
        sm.math1();
        sm.math2();
        sm.math3();
        sm.math4();

    }
}
