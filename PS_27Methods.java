public class PS_27Methods {

    // static int logic(int x, int y) {//static method NO Object creation only using
    // static method
    // // static method can be called without creating an object of the class
    // int z;
    // if (x > y) {
    // z = x + y;
    // } else {
    // z = (x + y) * 5;
    // }
    // return z;
    // }
    static int mysum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c;
        c = mysum(a, b);
        System.out.println(a + " " + b);
        // PS_27Methods obj = new PS_27Methods(); // Method invocation using object
        // creation
        // c = obj.mysum(a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        // c1 = obj.mysum(a1, b1) * 5;// Calling the non-static method directly is not
        // allowed, so we need to create an object
        c1 = mysum(a1, b1) * 5;
        System.out.println(c);
        System.out.println(c1);
    }
}
