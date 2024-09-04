public class break_java
{
	public static void main(String[]args)
	{
		int[]array = {1,2,3,4,5,6};
		for(int i = 0; i<array.length; i++)
		{
			if(array[i] == 5)
			{
				System.out.println("Index" +i);
				break;
			}
		}
	}
}
