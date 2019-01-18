public class Grader
{
	public static void grammar (String arr[])
	{
		String[] test = {"A","Z","a","z"};
		String[] mem = arr.clone();
		System.out.println("\nStaring sentance");
		for (String element : arr)
		{
			System.out.println(element);
		}
		System.out.println("\nIn lower case");
		for (String lowerElement : arr)
		{
			lowerElement = lowerElement.toLowerCase();
			System.out.println(lowerElement);
		}
		
		int periodAt = -1;
		System.out.println("Checking for period usage");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].indexOf(".") >= 0)
			{
				System.out.println("Removing period for word checking");
				periodAt = arr[i].indexOf(".");
				arr[i] = arr[i].substring(0, periodAt);
			}
			if (arr[i].indexOf("?") >= 0)
			{
				System.out.println("Removing question mark for word checking");
				periodAt = arr[i].indexOf("?");
				arr[i] = arr[i].substring(0, periodAt);
			}
			if (arr[i].indexOf("!") >= 0)
			{
				System.out.println("Removing exclamation mark for word checking");
				periodAt = arr[i].indexOf("!");
				arr[i] = arr[i].substring(0, periodAt);
			}
			if (arr[i].indexOf("s") == arr[i].length() - 1)
			{
				System.out.println("Removing ending 's' for word checking");
				periodAt = arr[i].indexOf("s");
				arr[i] = arr[i].substring(0, periodAt);
			}
			if (arr[i].indexOf("ed") == arr[i].length() - 2)
			{
				System.out.println("Removing ending 'ed' for word checking");
				periodAt = arr[i].indexOf("ed");
				arr[i] = arr[i].substring(0, periodAt);
			}
			if (arr[i].indexOf("ing") == arr[i].length() - 3)
			{
				System.out.println("Removing ending 'ing' for word checking");
				periodAt = arr[i].indexOf("ing");
				arr[i] = arr[i].substring(0, periodAt);
			}
		}
		System.out.println("Sentance without periods");
		for (String element : arr)
		{
			System.out.println(element);
		}
		
		//checking vocab words
		int vocabUsed = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] == vocab[0] || arr[i] == vocab[1] || arr[i] == vocab[2])
			{
				vocabUsed += 1;
			}
			if (vocabUsed >= 3)
			{
				System.out.println("All vocab words used atleast once");
			}
			if (vocabUsed < 3)
			{
				System.out.println("Not all vocab words are used");
			}
		}
	}
	
	
	void sorting(String words[])
	{
		int n = words.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int o = 0; o < n-i-1; o++)
			{
				if (words[o].compareTo(words[o+1]) > 0)
				{
					String save = words[o];
					words[o] = words[o+1];
					words[o+1] = save;
				}
			}
		}
	}
	
	void printArray(String words[])
	{
		int n = lowerCaseWords.length;
		for(int i = 0; i < n; i++)
		{
			System.out.println(words[i]);
		}
		System.out.println();
	}
	
	
	public static void main (String args[])
	{
		Grader ob = new Grader();
		String[] word = {"The","quick","brown","fox","jumps","over","the","lazy","dog.","The","quick","brown","fox","jumps","over","the","lazy","dog."};
		String lowerWord = word.clone().toLowerCase();
		public static String[] vocab = {"fox","jump","dog");
		ob.grammar(word);
		ob.sorting(lowerWord);
		System.out.println("Sorted Sentance:");
		ob.printArray(lowerWord);	
	}
}