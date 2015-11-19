import java.util.Scanner;

public class Runner
	{
	static Boolean ghost;
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Binary Search Quizer! You will be tested on the logic of the search,");	
		System.out.println(" so you will need to tell me what the left, right, and middle are in each step.");
		System.out.println("                       ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Searcher.genRandomArray();
		System.out.println("The target is "+Searcher.target);
		ghost=true;
		while (ghost==true)
			{
			System.out.println("~~~~~~~~~~~Pass~~~~~~~~~~~~");
			Searcher.binarySearch(Searcher.elements, Searcher.target);
			System.out.println("You have gotten "+(Searcher.counterR+Searcher.counterR2+Searcher.counterR3)+" correct and "+(Searcher.counterW+Searcher.counterW2+Searcher.counterW3)+" wrong.");
			}
		}
	}