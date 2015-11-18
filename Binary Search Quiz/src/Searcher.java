import java.util.Scanner;
public class Searcher
	{
	static int elements[]=new int[0];
	public static void genRandomArray()
	{
	for(int i=0; i<elements.length;i++)
		{
		elements[i] =(int)(Math.random()*12)+2;
		System.out.println(elements[i]);
		
		}
	System.out.println("jack");
	}
	public static int binarySearch(int[]elements, int target)
		{
		int left=0;
		int right = elements.length-1;
		while(left<=right)
			{
			int middle =(left+right)/2;
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
	}