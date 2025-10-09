package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        // Opret Scanner med File
        File file = new File(filnavn);
        Scanner scanner = new Scanner(file);
        String tekst = "";
        // Læs hele filens indhold (alle linjer samlet i en String)
        while(scanner.hasNextLine()){
            tekst += scanner.nextLine() + "\n";
        }
        // Luk Scanner
        scanner.close();
        // Returner indholdet
        return tekst;
    }
}
