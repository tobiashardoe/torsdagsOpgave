import java.util.ArrayList;

// task 4.e
class Main{
public static void main(String[] args){

// task 4.f
ArrayList<String> actions = new ArrayList<String>();

actions.add("Start game");
actions.add("Resume game");
actions.add("Pause game");
actions.add("End game");


// task 4.g
GameMenu start = new GameMenu(actions);
GameMenu resume = new GameMenu(actions);
GameMenu pause = new GameMenu(actions);
GameMenu end = new GameMenu(actions);


// System.out.println(actions.get(2));

/* task 4.i
start.displayMenu();*/

// task 5.d
 String userChoice = start.promptUser();


// task 5.g
int choice = Integer.parseInt(userChoice);
doAction(choice);

  }
  // task 5.e
  public static void doAction(int action){
    // task 5.f
     System.out.println("You have chosen: " + action);
    switch(action) {
    case 1:
      System.out.println("Starting the game now");
      break;
    case 2:
      System.out.println("Fetching previously saved game data");
      break;
    case 3:
      System.out.println("Game paused");
      break;
    case 4:
      System.out.println("Ending game");
      break;
    default:
      System.out.println("Invalid choice. Please try again");
    }
    
  }
}