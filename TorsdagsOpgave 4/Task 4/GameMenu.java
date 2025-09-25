import java.util.ArrayList;

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

}