package Lab_4;
import java.util.Scanner;
class CarOwner extends ServiceCenter
{
	int car_no,car_chessi;
	public String CustName;
	public long CustPhoneNo;
	Scanner input=new Scanner(System.in);
	@Override
	public void CarDetails() // Accept car details
	{
		System.out.print("Enter Car model=");
		CarModel=input.next();
		System.out.print("Enter fuel type=");
		FuelType=input.next();
		System.out.print("Enter Car number=");
		car_no=input.nextInt();
		super.setCarNum(car_no);
		System.out.print("Enter chessi number=");
		car_chessi=input.nextInt();
		super.setChassiNum(car_chessi);
	}
	public void acceptInfo() // Accept owner information
	{
		System.out.print("Enter owner name=");
		CustName=input.next();
		System.out.print("Enter owner contact number=");
		CustPhoneNo=input.nextLong();	
	}	
}
