package Lab_8;
import java.util.Scanner;
public class RemoveVowels 
{
    private static String removeVowels() 
    {
    	 Scanner input=new Scanner(System.in);
    	 String str;
         System.out.print("Enter a string=");
         str = input.nextLine();
         input.close();
        // Use regular expression to remove vowels
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    
    public static void main(String[] args) 
    {
        // Display the result
        System.out.println("String without vowels:" + removeVowels());
    }
}