public class continue_java
{
	public static void main(String[]args)
	{
		int[]array = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i<array.length; i++)
		{
			if(array[i] == 8)
			{
				System.out.print(i);
				continue;
			}	
		}
	}
}
