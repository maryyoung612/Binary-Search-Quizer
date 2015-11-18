import java.util.Scanner;

public class Runner
	{
	static int arrayNum;
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Binary Search Quizer! You will be tested on the logic of the search,");	
		System.out.println(" so you will need to tell me what the left, right, and middle are in each step.");
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Searcher.genRandomArray();
		}
	}