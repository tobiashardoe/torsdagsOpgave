
// task 1.a
public class Main{

	public static void main(String[]args){

		// task 1.g
		Team t1 = new Team("Team 1");

        // task 1.i
		t1.setRank(1);
		

		// task 1.k
		Team t2 = new Team("Team 2");
		Team t3 = new Team("Team 3");
		Team t4 = new Team("Team 4");
		Team t5 = new Team("Team 5");
		Team t6 = new Team("Team 6");

		t2.setRank(4);
		/*
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		*/

		// task 1.m
		t1.addPlayer("Bjarne");
		t1.addPlayer("Bob");
		t1.addPlayer("Tristan");
		t2.addPlayer("Tobias");
		t2.addPlayer("Søren");
		t2.addPlayer("Nicklas");


		System.out.println(t1);
		System.out.println(t2);
		

		
	}

	
}