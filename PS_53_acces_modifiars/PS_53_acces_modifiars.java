package PS_53_acces_modifiars;

class C1 {
    public int x = 45;
    protected int y = 34;
    int z = 87;
    private int a = 55;

    void math() {
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of a is: " + a);
    }

}

public class PS_53_acces_modifiars {
    public static void main(String[] args) {
        C1 obj = new C1();
        // obj.math();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        // System.out.println(obj.a); // This will throw an error as 'a' is private
    }

}
