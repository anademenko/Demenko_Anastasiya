public class GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray(numbers);
		
		System.out.println("For the following numbers... " );
		printArray(numbers);
		System.out.println("\nThe odd numbers are... " + getOdds(numbers));
	}
	
	public static void fillArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray(int[] numbers)
	{
		for(int num : numbers)
		{
			System.out.print(" " + num + " ");
		}
	}
	
	public static String getOdds(int[] numbers)
	{
		String odds = "";
		for(int num: numbers)
		{
			if(num % 2 == 1)
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}