import java.util.Arrays;
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
	public static void genRandomArray()
	{
	for(int i=0; i<elements.length;i++)
		{
		elements[i] =(int)(Math.random()*12)+1;
		System.out.print(elements[i]);
		System.out.print(" ");
		Arrays.sort(elements);
		}
	System.out.println();
	random=(int)(Math.random()*7)+1;
	System.out.println(random);
	target=elements[random];
	}
	
	public static int binarySearch(int[]elements, int target)
		{
		left=0;
		right = elements.length-1;
		while(left<=right)
			{
			middle =(left+right)/2;
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
	public static void checkLeftAnswer()
		{
		counterR=0;
		counterW=0;
		if(Runner.guessL==Searcher.left)
			{
			System.out.println("Good job, "+Runner.guessL+" is the correct answer!");
			counterR++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+left);
			counterW++;
			}
		}
	public static void checkRightAnswer()
		{
		counterR2=0;
		counterW2=0;
		if(Runner.guessR==Searcher.right)
			{
			System.out.println("Good job, "+Runner.guessR+" is the correct answer!");
			counterR2++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+right);
			counterW2++;
			}
		}
	public static void checkMiddleAnswer()
		{
		counterR3=0;
		counterW3=0;
		if(Runner.guessM==Searcher.middle)
			{
			System.out.println("Good job, "+Runner.guessM+" is the correct answer!");
			counterR3++;
			}
		else
			{
			System.out.println("That is wrong. The correct answer is "+middle);	
			counterW3++;
			}
		}
	}