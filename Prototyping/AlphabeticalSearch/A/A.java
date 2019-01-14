public class A
{
	void sorting(String lowerCaseArr[])
	{
		int n = lowerCaseArr.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int o = 0; o < n-i-1; o++)
			{
				if (lowerCaseArr[o].compareTo(lowerCaseArr[o+1]) > 0)
				{
					String save = lowerCaseArr[o];
					lowerCaseArr[o] = lowerCaseArr[o+1];
					lowerCaseArr[o+1] = save;
				}
			}
		}
	}
	void printArray(String lowerCaseArr[])
	{
		int n = lowerCaseArr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.println(lowerCaseArr[i]);
		}
		System.out.println();
	}
	public static void main (String[] args)
	{
		A ob = new A();
		String[] arr = {"The", "quick", "brown","fox", "jumps","over", "the", "lazy", "dog."};
	String[] lowerCaseArr = new String[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			lowerCaseArr[i] = arr[i].toLowerCase();
		}
		ob.sorting(lowerCaseArr);
		System.out.println("Sorted array");
		ob.printArray(lowerCaseArr);
	}
}