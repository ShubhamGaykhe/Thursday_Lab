package Lab_9;

import java.util.Scanner;

public class ConcatStrings
{
    String longString="";
    Scanner sc= new Scanner(System.in);
    
    String concatAll(String [] str) // concat the string 
    {
        for(String name : str)
        {
            if(name.isEmpty())
                System.out.println("String is empty");
            else 
                longString+=name; // join the string
        }
        return longString;
    }
    
    public String[] acceptString()
    {
        System.out.print("How many String you want:- ");
        int n=sc.nextInt(); // accept how many string you  want
        String [] name=new String[n];
        for(int i=0;i<n;i++)
        {
        	System.out.print("Enter string=");
            name[i]=sc.next(); // accept string one by one
        }
        return name;
    }

    public static void main(String[] args)
    {
        ConcatStrings obj= new ConcatStrings();
        String str="";
        str=obj.concatAll(obj.acceptString());
        System.out.println("Concatenated String "+str);
    }
}