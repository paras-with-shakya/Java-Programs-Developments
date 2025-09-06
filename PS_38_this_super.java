class EkClass {
    int p;

    public int getA() {
        return p;
    }

    EkClass(int p) {
        // p = s;
        this.p = p;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int q) {
        super(q);
        System.out.println("I am a constructor of DoClass");
    }
}

public class PS_38_this_super {
    public static void main(String[] args) {
        EkClass ek = new EkClass(5);
        DoClass dc = new DoClass(7);
        System.out.println(ek.getA());

    }
}
