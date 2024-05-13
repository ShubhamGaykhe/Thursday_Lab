//Write an application to create a book managment system to do the following process  :
//Add book
//Update book
//Delete book
//add author to each by using collection framwork.

package Lab_11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookManagement 
{
	List<String> bookName=new LinkedList<>();
	List<String> bookAuthor=new LinkedList<>();
	
	String name;
	int i;
	Scanner input=new Scanner(System.in);
	
	public void choices()  // Menu for book management
	{
		do
		{
			System.out.println("=-=-=-=-=-=-=- Operations =-=-=-=-=-=-=-\n"
					+ "1) Add Book\n"
					+ "2) Update Book\n"
					+ "3) Delete Book\n"
					+ "4) Add Author\n"
					+ "5) Exit\n"
					+ "Enter your choice=");
			switch(input.nextInt())
			{
				case 1:
					AddBook();
					break;
					
				case 2:
					UpdateBook();
					break;
					
				case 3: 
					DeleteBook();
					break;
					
				case 4:
					AddAuthor();
					break;
					
				case 5: 
					System.exit(0);
					break;
					
					default:
						System.out.println("Enter valid choice\n");
			}
		}while(true);
	}
	
	public void AddBook()  // Add new Book 
	{
		System.out.print("Enter Book name=");
		bookName.add(input.next());
	}
	
	public void UpdateBook()  // Update book Name
	{
		if(!bookName.isEmpty())
		{
			System.out.print("Enter book name=");
			name=input.next();
			if(bookName.contains(name))
			{
				System.out.print("Enter new book name=");
				bookName.add(bookName.indexOf(name),input.next());
				bookName.remove(name);
			}
			else
			{
				System.out.println("Book not found");
			}
		}
		else
		{
			System.out.println("First add the book");
		}
	}
	
	public void DeleteBook() // Delete book 
	{
		System.out.print("Enter book name=");
		name=input.next();
		if(!bookName.isEmpty())
		{
			if(bookName.contains(name))
			{
				bookName.remove(bookName.indexOf(name));
				bookAuthor.remove(bookAuthor.indexOf(name));
			}
			else
			{
				System.out.println("Book not found");
			}
		}
		else
		{
			System.out.println("First add the book");
		}
	}
	
	public void AddAuthor() // Add author to each book
	{
		if(!bookName.isEmpty())
		{
			for(i=0;i<bookName.size();i++)
			{
				System.out.print("Enter author name for "+bookName.get(i)+" =");
				bookAuthor.add(i, input.next());
			}
		}
		else
		{
			System.out.println("First add the book");
		}
	}
	public static void main(String[] args)
	{
		BookManagement obj=new BookManagement();
		obj.choices();
	}
}