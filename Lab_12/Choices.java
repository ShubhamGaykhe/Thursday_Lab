package Lab_12;

public class Choices extends BookManagement
{
	InsertBook insertBook=new InsertBook();
	ModifyBook modifyBook=new ModifyBook();
	DeleteBook deletetBook=new DeleteBook();
	DisplayBook displayBook=new DisplayBook();
	
	InsertAuthor insertAuthor=new InsertAuthor();
	ModifyAuthor modifyAuthor=new ModifyAuthor();
	DeleteAuthor deletetAuthor=new DeleteAuthor();
	DisplayAuthor displayAuthor=new DisplayAuthor();

	int choice;
	public void choicess()
	{
		do
		{
			System.out.print("\n------ OPERATIONS ------\n"
					+ "1) Insert\n"
					+ "2) Modify\n"
					+ "3) Delete\n"
					+ "4) View all\n"
					+ "5) Exit\n"
					+ "choose Operation=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						insertBook.insertBookData();
					if(choice==2)
						insertAuthor.insertAuthorData();
					else
						System.out.println("Not Valid");
					break;
					
				case 2:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						modifyBook.modifyBookData();
					if(choice==2)
						modifyAuthor.modifyAuthorData();
					else
						System.out.println("Not Valid");
					break;
					
				case 3:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						deletetBook.deleteBookDetails();
					if(choice==2)
						deletetAuthor.deleteAuthorDetails();
					else
						System.out.println("Not Valid");
					break;
					
				case 4:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						displayBook.displayBookDetails();
					if(choice==2)
						displayAuthor.displayAuthorDetails();
					else
						System.out.println("Not Valid");
					break;
					
				case 5:
					System.exit(0);
					break;
			}
		}while(true);
	}
	public static void main(String[] args) 
	{
		Choices obj=new Choices();
		obj.choicess();
	}

}
