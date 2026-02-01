@FunctionalInterface
interface DemoAmo {
    void Method1(int a);
    // void Method2();
}

// class ParasFun implements DemoAmo{
//     @Override
//     public void Method1(){
//         System.out.println("This is my method 1");
//     }
// }

// class AnonyDemo implements DemoAmo {
// public void display(){
// System.out.println("This is my methods");
// }

// @Override
// public void Method1() {
// System.out.println("This is my method 1");
// // throw new UnsupportedOperationException("Not supported yet.");
// }

// @Override
// public void Method2() {
// System.out.println("This is my method 2");
// // throw new UnsupportedOperationException("Not supported yet.");
// }
// }
public class PS_83_lambdea {
    public static void main(String[] args) {
        // DemoAmo obj = new AnonyDemo();
        // obj.Method1();
        // obj.Method2();

        // Anonymous Class
        // DemoAmo obj = new DemoAmo() {
        //     @Override
        //     public void Method1() {
        //         System.out.println("This is my method 1");
        //     }

        //     @Override
        //     public void Method2() {
        //         System.out.println("This is my method 2");
        //     }
        // };
        // obj.Method1();
        // obj.Method2();

        // Lambda Expression
        // DemoAmo obj =new ParasFun();
        // obj.Method1();
        DemoAmo obj = (a) -> {
            System.out.println("This is my method 1: " + a);
        };
        obj.Method1(6); // only one method Calling this lambda expression


    };
}
