package Lab_4;
import java.util.Random;
public class PayBill extends ServiceBill // class for paying bill
{
	Random rand=new Random();
	char option;
	int otp,randNo,amount;
	boolean flag=true;
	public void Pay()
	{
		do
		{
			System.out.println("You want to pay bill know(Y/N");
			option=input.next().charAt(0);
			if(option=='Y' || option=='y')
			{
				flag=false;
				randNo=rand.nextInt((9999-100)+1)+10; // generate random number
				System.out.println("..........Your OTP is:"+randNo);
				System.out.println("Pay bill option\n"
						+ "a) GPay\n"
						+ "b) Phone Pay\n"
						+ "c) Paytm\n"
						+ "d) UPI\n"
						+ "Enter option number=");
				option=input.next().charAt(0);
				if(option=='a'||option=='b'||option=='c'||option=='d')
				{
					flag=false;
					System.out.print("Enter your OTP=");
					otp=input.nextInt();
					if(otp==randNo)
					{
						System.out.print("Enter amount=");
						amount=input.nextInt();
						System.out.println("Remaining amount="+(bill-amount));
						System.out.println("<----  Payment succefully done  ---->");
					}
					else
					{
						System.out.println("Invalid OTP");
						flag=true;
					}
				}
				else
				{
					System.out.println("Select proper option");
					flag=true;
				}
			}
			else
			{
				System.out.println("You can't get your car back");
				flag=true;
			}
		}while(flag==true);
	}
}
