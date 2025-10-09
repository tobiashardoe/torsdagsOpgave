package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {
    // task 3.7
    public static void main(String[] args) {
        // task 3.1
        Scanner inputScanner = new Scanner(System.in);
        boolean fileFound =true;
        while(fileFound){
            System.out.println("Indtast filnavnet");
            // task 3.2
            String readFile = inputScanner.nextLine();
            File file = new File(readFile);
            // task 3.4
            try{
                Scanner fileScanner = new Scanner(file);
                System.out.println("Fil: " + readFile + " fundet!\nIndlæser indhold");
                // task 3.3
                while(fileScanner.hasNextLine()){
                    System.out.println(fileScanner.nextLine());
                }
            fileFound =false;
            } catch (FileNotFoundException e) {
                // task 3.5
                System.out.println("Filen findes ikke, prøv igen");
                // task 3.6
                fileFound =true;
            }
            }
        }
}
