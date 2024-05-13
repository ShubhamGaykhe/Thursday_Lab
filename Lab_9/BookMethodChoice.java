package Lab_9;

public class BookMethodChoice extends BookManagament
{
	public void choices()
	{
		int choice;
		do
		{
			System.out.print("*********** Operations ***********\n"
					+ "1) Insert book\n"
					+ "2) Delete book\n"
					+ "3) Display book\n"
					+ "4) Exit"
					+ "Enter your choice=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					createBook();
					break;
					
				case 2:
					deleteBook();
					break;
					
				case 3:
					displayBook();
					break;
					
				case 4:
					System.exit(0);
					break;
					
					default:
						System.out.println("Enter your choice");
			}
		}while(true);
	}
}
