package Task2;
import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        boolean info = true;
        while(info)
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Indtast dit fødselsår:");
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
            int age;
            age = 2025-choice;
            System.out.println("Du er "+age+" år gammel");
            info= false;
            // task 2.1
        } catch (NumberFormatException e) {
            // task 2.2
            System.out.println("Ugyldigt input! Prøv igen");
            // task 2.3, 2.4
            info=true;

        }

        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}