package Lab_4;

class ServiceBill extends Service // class for display
{
	int bill=0;
	public void displayBill()
	{
		super.services();
		System.out.println("------------------------------------------------\n");
		System.out.println("Owner name="+CustName);
		System.out.println("Contact no.="+CustPhoneNo);
		System.out.println("Car name="+CarModel);
		System.out.println("Fuel type="+FuelType);
		System.out.println("\n<<<<<<<<<<<..BILL..>>>>>>>>>>>>\n");
		System.out.println("--------------------------------");
		System.out.print("Services\t\tPrice\n");
		System.out.println("--------------------------------");
		for(int j=0;j<i;j++)
		{
			System.out.println(services[j]+"\t\t"+amount[j]);
			bill+=amount[j];
		}
		System.out.println("--------------------------------");
		System.out.println("Final Amount\t\t"+bill);		
	}
}
