import java.io.File;

public class PS_86_FileHanding {
    public static void main(String[] args) {
        /* 
        // Create a New file
        File myfile = new File("PS_86_FileHanding.txt");
        try {
            myfile.createNewFile();
            
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
       

        //Write to a file
        try {
            FileWriter fileWriter = new FileWriter("PS_86_FileHanding.txt");
            fileWriter.write("This is my first file handling program in Java\nOKky Now Byye");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch blockPS_86_FileHanding.txt
            System.out.println("Error writing to file");
        }
           
            
        //Reading a file
        File myfile = new File("PS_86_FileHanding.txt");
        try {
            Scanner sc = new java.util.Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
         */

        //Deletting A file
        File myfile =new File("PS_86_FileHanding.txt");
        if(myfile.delete()){
           System.out.println("File deleted: " + myfile.getName());
        }
        else{
            System.out.println("Some Problems Occured While Deleting the file");
        }        


    }
}
