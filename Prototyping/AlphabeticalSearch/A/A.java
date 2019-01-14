public class A
{
	void sorting(String lowerCaseWords[])
	{
		int n = lowerCaseWords.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int o = 0; o < n-i-1; o++)
			{
				if (lowerCaseWords[o].compareTo(lowerCaseWords[o+1]) > 0)
				{
					String save = lowerCaseWords[o];
					lowerCaseWords[o] = lowerCaseWords[o+1];
					lowerCaseWords[o+1] = save;
				}
			}
		}
	}
	void printArray(String lowerCaseWords[])
	{
		int n = lowerCaseWords.length;
		for(int i = 0; i < n; i++)
		{
			System.out.println(lowerCaseWords[i]);
		}
		System.out.println();
	}
	public static void main (String[] args)
	{
		A ob = new A();
		String[] words = {"The", "quick", "brown","fox", "jumps","over", "the", "lazy", "dog."};
		String[] lowerCaseWords = new String[words.length];
		for (int i = 0; i < words.length; i++)
		{
			lowerCaseWords[i] = words[i].toLowerCase();
		}
		ob.sorting(lowerCaseWords);
		System.out.println("Sorted array");
		ob.printArray(lowerCaseWords);
	}
}