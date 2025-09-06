class One {
    public int a;

    public int paras() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class One");
    }

}

class Two extends One {
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class Two");
    }

    public void meth3() {
        System.out.println("I am method 3 of class Two");
    }
}

public class PS_39_methodoverri {
    public static void main(String[] args) {
        One on = new One();
        on.meth2();
        Two tw = new Two();
        tw.meth2();

    }
}
