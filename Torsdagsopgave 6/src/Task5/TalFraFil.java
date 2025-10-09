package Task5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];
        int i = 0;

        // Læs tal fra fil "tal.txt" med Scanner
        try{
            File file = new File("tal.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String readLine = scanner.nextLine();
                int counter = Integer.parseInt(readLine);
                talArray[i] = counter;
                i++;

            }
            System.out.println("Filen blev læst, Programmet lukkes");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen. Programmet lukkes");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Der er for mange tal i denne fil. Programmet lukkes");
        } catch (NumberFormatException e){
            System.out.println("Der skal kun være tal i filen. Programmet lukkes");

        }
        // Gem tallene i talArray
        // Håndter følgende exceptions med separate catch-blokke:
        // - FileNotFoundException
        // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)
        // - NumberFormatException (hvis filen indeholder ikke-tal)
    }
}