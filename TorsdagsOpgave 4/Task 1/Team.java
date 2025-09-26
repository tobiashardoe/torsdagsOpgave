import java.util.ArrayList;


// task 1.b
public class Team{
	
    // task 1.c
	private String name;

	// task 1.d
	private int rank;

	// task 1.e
	// private String players;

	//task 1.l
	private ArrayList<String> players = new ArrayList<String>();

	public void addPlayer(String playerName){
		players.add(playerName);
	}


    // task 1.f
	public Team (String teamName){
		this.name=teamName;
	}

	// task 1.h
	public void setRank(int teamRank){
		this.rank=teamRank;
	}

   /* @Override
    // task 1.j
	public String toString(){

		return "Hold: "+ this.name + "Spillere: " + this.players "Rang: "+ this.rank;
	}*/
	
	@Override
	//task 1.m
	public String toString(){
		String listPlayers = "";
		for (String p: players){
			listPlayers +=p +"\n";
		}

		return "Hold: " + this.name +
		       "\nRang: " + this.rank +
		       "\nSpillere:\n" + listPlayers;
		       

	
}
}