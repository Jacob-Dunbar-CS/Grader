public class AlphabeticalSearch
{
	public static void main (String[] args)
	{
		//System.out.println("\nYeet"); //Debugging line
		
		//Input String and Verify
		String[] word = {"The","quick","brown","fox","jumps","over","the","lazy","dog."};
		for (int i = 0; i < word.length; i++)
		{
			System.out.println(word[i]); //Debugging line
		}
		//Compare two words
		System.out.println(word[0].compareTo(word[6]));
	}
}