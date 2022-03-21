import java.util.Scanner;

public class NextFunction{
    public static void main(String args[]){
	//Create the Scanner object tor the flow "in"
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please, type a number: ");
	//Typing the number and store it in a variable
	int n;
	n = keyboard.nextInt();
	//Declare the reference for the Strings
	String nombre;
	System.out.print("Please type your name: ");
	//The user types a String that is the user's name
	//Taking the CR (end of line) used to introduce a number
	keyboard.nextLine();
	nombre = keyboard.nextLine();
    }
}
