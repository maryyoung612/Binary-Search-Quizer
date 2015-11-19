import java.util.Arrays;
import java.util.Scanner;
public class Searcher
	{
	static int elements[]=new int[8];
	static int left;
	static int right;
	static int middle;
	static int target;
	static int random;
	static int counterR;
	static int counterW;
	static int counterR2;
	static int counterW2;
	static int counterR3;
	static int counterW3;
	public static int binarySearch(int[]elements, int target)
		{
		left=0;
		System.out.println("What would the left be?");
		checkLeftAnswer();
		right = elements.length-1;
		System.out.println("What would the right be?");
		checkRightAnswer();
		while(left<=right)
			{
			middle =(left+right)/2;
			System.out.println("What would the middle be?");
			checkMiddleAnswer();
			if(target<elements[middle])
				{
				right=middle-1;
				}
			else if(target>elements[middle])
				{
				left=middle+1;
				}
			else
				{
				return middle;
				}
			}
		return -1;
		}
	public static void genRandomArray()
	{
	for(int i=0; i<elements.length;i++)
		{
		elements[i] =(int)(Math.random()*12)+1;
		}
	Arrays.sort(elements);
	for(int i=0; i<8;i++)
		{
		System.out.print(elements[i]+ " ");
		}
	System.out.println();
	random=(int)(Math.random()*7)+1;
	target=elements[random];
	}
	public static void checkLeftAnswer()
		{
		counterR=0;
		counterW=0;
		Scanner userInput = new Scanner(System.in);
		int guessL=userInput.nextInt();
		if(guessL==left)
			{
			System.out.println("Good job, "+guessL+" is the correct answer!");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			counterR++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+left);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			counterW++;
			}
		}
	public static void checkRightAnswer()
		{
		counterR2=0;
		counterW2=0;
		Scanner userInput = new Scanner(System.in);
		int guessR=userInput.nextInt();
		if(guessR==right)
			{
			System.out.println("Good job, "+guessR+" is the correct answer!");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			counterR2++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+right);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			counterW2++;
			}
		}
	public static void checkMiddleAnswer()
		{
		counterR3=0;
		counterW3=0;
		Scanner userInput = new Scanner(System.in);
		int guessM=userInput.nextInt();
		if(guessM==middle)
			{
			System.out.println("Good job, "+guessM+" is the correct answer!");
			System.out.println("~~~~~~~~~~~~~Next Pass~~~~~~~~~~~~~");
			counterR3++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+middle);	
			System.out.println("~~~~~~~~~~~Next Pass~~~~~~~~~~~~~~~");
			counterW3++;
			}
		}
	}