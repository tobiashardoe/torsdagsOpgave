import java.util.Scanner;

// task 2.a
class Main{

    
	public static void main(String [] args){

        // task 2.b
		System.out.println("Please type your name:");

		// task 2.c
		Scanner sc = new Scanner(System.in);

		// task 2.d
		String name = sc.nextLine();

		// task 2.e
		System.out.println("Hello " + name +", " + "\nPlease type your age:");

        // task 2.f
		int age = sc.nextInt();

		// task 2.g
		System.out.println("You are " + age + " years old." + "\nPlease type the age your retirement starts:");

		// task 2.h
		int retirement = sc.nextInt();
        System.out.println("You have " + (retirement - age) + " years until retirement.");



	}


}