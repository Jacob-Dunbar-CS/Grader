public class A
{
	public static void main (String[] args)
	{
		String[] word = {"The","quick","brown","fox","jumps","over","the","lazy","dog."};
		boolean stop = false;
		int whileNum = 0;
		int stopCount = 0;
		String save;
		String[] lowerCaseWord = new String[word.length];
		int compare;
		
		
		for (int i = 0; i < word.length; i++)
		{
			lowerCaseWord[i] = word[i].toLowerCase();
		}
		
		while (stop == false)
		{
			whileNum += 1;
			for (int i = 1; i < lowerCaseWord.length; i++)
			{
				if (lowerCaseWord[i].equals(lowerCaseWord[i-1]))
				{
				}
				else 
				{
					if (lowerCaseWord[i].compareTo(lowerCaseWord[i-1]) < 0)
					{
						System.out.println("\n" + lowerCaseWord[i] + "\n" + lowerCaseWord[i-1]);
						System.out.println(lowerCaseWord[i].compareTo(lowerCaseWord[i-1]));
						save = lowerCaseWord[i];
						lowerCaseWord[i] = lowerCaseWord[i-1];
						lowerCaseWord[i-1] = save;
						stop = false;
						System.out.println("\n" + lowerCaseWord[i] + "\n" + lowerCaseWord[i-1] + "\n");	
					}
					else
					{

						stop = true;
						System.out.println("\nRan while loop " + whileNum + " times");
						for (int a = 0; a < lowerCaseWord.length; a++)
						{
							System.out.println(lowerCaseWord[a]);
						}
					}
				}
			}
		}
	}
}