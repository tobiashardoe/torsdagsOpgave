import java.util.ArrayList;
import java.util.Scanner; 

// task 4.a
class GameMenu{

	//task 4.b
	private ArrayList<String> actions;

	// task 4.c
	public GameMenu(ArrayList<String> actions){
		// task 4.d
		this.actions=actions;


	}
    // task 4.h
	public void displayMenu(){

		for (String e: actions){
			System.out.println(e);
		}
	}
    
    // task 5.a & 5.c
	public String promptUser(){

		System.out.println("Type a number to choose an action");
		displayMenu();
		// task 5.b
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		return choice;


	}

}