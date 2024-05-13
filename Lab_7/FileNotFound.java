package Lab_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound 
{
	public void checkFile()
	{
		try 
		{
            String filePath = "sample.txt";
            File file = new File(filePath);
            Scanner data = new Scanner(file);

            // Read and prin t each line from the file
            while (data.hasNextLine()) {
                System.out.println(data.nextLine());
            }

        } 
		catch (FileNotFoundException e) 
		{
            // Handle FileNotFoundException
            System.out.println("Error: The specified file does not exist.");

        } 
	}
    public static void main(String[] args)
    {
    	FileNotFound obj=new FileNotFound();
    }
}
