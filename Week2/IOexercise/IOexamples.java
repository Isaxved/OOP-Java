package Week2.IOexercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOexamples {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/azat/Desktop/text.txt");
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNext()){
            fileContent = fileContent.concat(scanner.nextLine()) + "\n";
        }
        System.out.println(fileContent);
    }
}
