package Task4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserPorgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();

        while (true) {
            System.out.println("Skriv et filnavn");
            String writeFile = scanner.nextLine();
            try {
                String fileInfo = fileIO.laesFilIndhold(writeFile);
                System.out.println("Filens indhold: \n");
                System.out.println(fileInfo);

            } catch (FileNotFoundException e) {

                System.out.println("Filen kunne ikke findes, prøv igen");

            }
        }
    }
}
