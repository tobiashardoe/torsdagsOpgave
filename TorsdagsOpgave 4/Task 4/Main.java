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

// task 4.i
start.displayMenu();

  }
}