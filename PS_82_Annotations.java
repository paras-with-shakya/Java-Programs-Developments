@FunctionalInterface
interface BigAnimal{
     void second();
    //  void first();

}


/**
 * Annotations in Java provide metadata about the program that is not part of the program itself.
 * They can be used to give instructions to the compiler, provide information for runtime processing, or generate code and documentation.
 * Commonly used annotations include @Override, @Deprecated, and @SuppressWarnings.
 * In this example, we demonstrate the use of these annotations.
 * @author Paras Shakya
 * @version 1.0
 * @since 29-01-2026
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/annotations/">Java Annotations Tutorial</a>
 */

class MyPhone {
    public void ShowTime() {
        System.out.println("Time is 11:00 Am MyPhone");
    }
}

class YouSmartPhone extends MyPhone {
    @Override
    public void ShowTime() {
        System.out.println("Time is 11:00 Pm YouSmartPhone");
    }
     /**
         * This method is deprecated and should not be used.
         * */
    /**
     * Returns the sum of two integers.
     *
     * @param a the first addend
     * @param b the second addend
     * @return the sum of {@code a} and {@code b}
     * @deprecated Use {@link Math#addExact(int,int)} to detect overflow, or use a wider type (e.g. {@code long}) or {@link java.math.BigInteger} if overflow must be avoided.
     */
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class PS_82_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        YouSmartPhone ys = new YouSmartPhone();
        ys.ShowTime();
        // YouSmartPhone ys = new YouSmartPhone();
        // ys.ShowTime();
        // MyPhone mp = new MyPhone();
        // mp.ShowTime();
        ys.sum(5,7);

    }
}
