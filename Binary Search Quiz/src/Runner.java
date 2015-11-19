import java.util.Scanner;

public class Runner
	{
	static int arrayNum;
	static int guessL;
	static int guessR;
	static int guessM;
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Binary Search Quizer! You will be tested on the logic of the search,");	
		System.out.println(" so you will need to tell me what the left, right, and middle are in each step.");
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Searcher.genRandomArray();
		System.out.println("The target is "+Searcher.target);
		Boolean ghost=true;
		while (ghost=true)
			{
			System.out.println("~~~~~~~~~~~Pass~~~~~~~~~~~~");
			Searcher.binarySearch(Searcher.elements, Searcher.target);
			Runner.askQuestion();
			System.out.println("You have gotten "+(Searcher.counterR+Searcher.counterR2+Searcher.counterR3)+" correct and "+(Searcher.counterW+Searcher.counterW2+Searcher.counterW3)+" wrong.");
			}
		}
	public static void askQuestion()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Here is the array of ordered numbers, what would the position of the left be?");
		guessL=userInput.nextInt();
		Searcher.checkLeftAnswer();
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("What would the position of the right be?");
		guessR=userInput.nextInt();
		Searcher.checkRightAnswer();
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("What would the position of the middle be?");
		guessM=userInput.nextInt();
		Searcher.checkMiddleAnswer();
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}