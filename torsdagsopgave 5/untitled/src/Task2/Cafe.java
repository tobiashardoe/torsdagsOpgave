package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    // task 2.c
    private ArrayList<String> coffeeMenu = new ArrayList<>();


    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    // task 2.c
    public void loadMenuData(){
        // task 2.d 2.e
        try{
                File file = new File("coffees.txt");
                Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String coffee = scan.nextLine();
                coffeeMenu.add(coffee);
                System.out.println(coffee);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found, check path and filename");
            e.printStackTrace();
        }

    }
}
