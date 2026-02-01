// class MyDeprecated {
//     @Deprecated
//     void meth1() {
//         System.out.println("This is a deprecated method 1");
//     }
// }

import java.io.FileWriter;
import java.io.IOException;

interface MyInt{
    void display();
}

public class PS_87_PrecticeSet {
    // @SuppressWarnings("deprecation") 
    public static void main(String[] args) {
        // PS1
        // MyDeprecated obj = new MyDeprecated();
        // obj.meth1();
        // PS2
        // MyInt i = () -> {
        //     System.out.println("This is an Interface methods");
        // };
        // i.display();

        // PS3
        int i = 19;
        String Table = "";
        for(int j =1; j<=10; j++){
            Table += i + "X" + j + "=" + (i*j) + "\n";
            Table+= "\n";
        }

         try {
            FileWriter fileWriter = new FileWriter("PS_87_Multiplication.txt");
            fileWriter.write(Table);
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch blockPS_86_FileHanding.txt
            System.out.println("Error writing to file");
        }

    }
}
