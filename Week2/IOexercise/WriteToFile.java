package Week2.IOexercise;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    public void writeToFile() {
        try {
            FileOutputStream myFile = new FileOutputStream("stalkingUTF.txt");
            PrintWriter out = new PrintWriter(myFile);
//            out.print();
//            out.close();
        } catch (IOException e) {
            System.out.println("Don't write date to File");
        }
    }
}
