package Lab_10;

import java.util.*;

class Product implements Comparable<Product> {
    String name;
    double price;
    int num,i;
    Scanner input=new Scanner(System.in);
    
    List<Product> products = new ArrayList<>();
    
    public Product() {}
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void accept()
    {
    	 System.out.print("How many product you want=");
         num=input.nextInt();
         for(i=0;i<num;i++)
         {
        	 System.out.print("Enter name=");
        	 name=input.next();
        	 
        	 System.out.print("Enter price=");
        	 price=input.nextDouble();
        	 
        	 products.add(new Product(name,price));
         }
         sortedProduct();
    }
    @Override
    public int compareTo(Product pt) {
        // Compare products based on their prices
        if (this.price < pt.price) 
            return -1;
        else if (this.price > pt.price) 
            return 1;
        else 
            return 0;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
    
    public void sortedProduct()
    {
    	Collections.sort(products);
    	for(Product pt:products)
    	{
    		System.out.println("Name:"+pt.name+"\t price:"+pt.price);
    	}
    }
    public static void main(String[] args) 
    {     
    	Product obj=new Product();
    	obj.accept();
    }
}