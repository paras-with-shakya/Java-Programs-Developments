public class PS_74_Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365 + 1970);
        
        // Quick Quiz: What is the value of Long.MAX_VALUE?
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
    }
}
