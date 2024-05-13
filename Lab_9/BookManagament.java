	package Lab_9;
	
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Scanner;
	
	public class BookManagament
	{
		Scanner input=new Scanner(System.in);
		int bookId,availability,i;
		String bookName,authorName;
		static String libraryName;
		double bookPrice;
		
		LinkedList<Integer> id=new LinkedList<>();
		LinkedList<String> name=new LinkedList<>(); 
		LinkedList<String> author=new LinkedList<>();  
		LinkedList<Double> price=new LinkedList<>(); 
		LinkedList<Integer> quantity=new LinkedList<>(); 
		public void createBook()
		{
			System.out.print("Enter book Id=");
			bookId=input.nextInt();
			id.add(bookId);
			
			System.out.print("Enter book name=");
			bookName=input.next();
			name.add(bookName);
			
			System.out.print("Enter author name=");
			authorName=input.next();
			author.add(authorName);
			
			System.out.print("Enter book price=");
			bookPrice=input.nextDouble();
			price.add(bookPrice);
			
			System.out.print("Enter book quantity=");
			availability=input.nextInt();
			quantity.add(availability);
		}
		
		public void deleteBook()
		{
			int Id;
			System.out.print("Enter book Id for delete book=");
			Id=input.nextInt();
			for(i=0;i<name.size();i++)
			{
				if(Id==id.get(i))
				{
					id.remove(i);
					name.remove(i);
					author.remove(i);
					price.remove(i);
					quantity.remove(i);
				}
			}
		}
		
		public void displayBook()
		{
			Iterator<Integer> idDisplay=id.iterator();
			Iterator<String> nameDisplay=name.iterator();
			Iterator<String> authorDisplay=author.iterator();
			Iterator<Double> priceDisplay=price.iterator();
			Iterator<Integer> quantityDisplay=quantity.iterator();
			
			if(!name.isEmpty()) 
			{
				while(idDisplay.hasNext() && nameDisplay.hasNext() 
						&& authorDisplay.hasNext() && priceDisplay.hasNext()
						&& quantityDisplay.hasNext())
				{
					System.out.println("ID:"+idDisplay.next());
					System.out.println("NAME:"+nameDisplay.next());
					System.out.println("AUTHOR:"+authorDisplay.next());
					System.out.println("PRICE:"+priceDisplay.next());
					System.out.println("QUANTITY:"+quantityDisplay.next());
				}
			}
		}
	}