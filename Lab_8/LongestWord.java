package Lab_8;

import java.util.Scanner;

public class LongestWord 
{
	public void Longest_word()
	{
		String sentance,str1="",longest="";
		int i,count=0,max=1;
		char str;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Entre sentance=");
		sentance=input.nextLine();
		input.close();
		
		for(i=0;i<sentance.length();i++)
		{
			str=sentance.charAt(i);  // slipt the sentance into single character
			if(str==32 || str=='\0')
			{
				if(max<count) // check the word count with max count
				{
					longest="";
					max=count;
					longest=str1;
				}
				// make count and word empty
				str1="";
				count=0;
			}
			else
			{
				// count the length and store the word
				count++;
				str1+=str;
			}
		}
		System.out.println("Longest Word="+longest);
		System.out.println("Lenght of word="+max);
	}
	public static void main(String[] args) 
	{
		LongestWord obj=new LongestWord();
		obj.Longest_word();
	}
}