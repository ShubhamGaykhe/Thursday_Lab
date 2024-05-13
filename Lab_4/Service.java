package Lab_4;

class Service extends CarOwner // class for switch case
{
	int choice,i=0;
	int[] amount=new int[20];
	String[] services = new String[20];
	char choices;
	public void services()
	{
		do
		{
			System.out.println("Avoilable services......>>>>>>\n"
					+ "1) Car washing\t\t 350 Rs\n"
					+ "2) Car cleaning\t\t 1000 Rs\n"
					+ "3) Oil change\t\t 750 Rs\n"
					+ "4) Car repairing\n"
					+ "Enter service=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					services[i]="Car washing";
					amount[i]=350;
					i++;
					break;
					
				case 2:
					services[i]="Car cleaning";
					amount[i]=1000;
					i++;
					break;
					
				case 3:
					services[i]="Oil change";
					amount[i]=750;
					i++;
					break;
					
				case 4:
					do
					{
						System.out.println("Repairing available......>>>>>>\n"
								+ "1) Tyre repairing\t\t 550 Rs\n"
								+ "2) Engine work\t\t\t 1500 Rs\n"
								+ "3) Colour modification\t\t 1200 Rs\n"
								+ "4) Any body work\t\t 2000 Rs\n"
								+ "Enter repairing services=");
						choice=input.nextInt();
						switch(choice)
						{
							case 1:
								services[i]="Tyre repairing";
								amount[i]=550;
								i++;
								break;
								
							case 2:
								services[i]="Engine work";
								amount[i]=1500;
								i++;
								break;
								
							case 3:
								services[i]="Colour modification";
								amount[i]=1200;
								i++;
								break;
								
							case 4:
								services[i]="Any body work";
								amount[i]=2000;
								i++;
								break;
								
							default:
								System.out.println("Enter valid choice");
						}
						System.out.println("Any more servives(Y/N)");
						choices=input.next().charAt(0);
					}while(choices=='y' || choices=='Y');
					break;
				default:
					System.out.println("Enter valid choice");
			}
			System.out.println("Any more servives(Y/N)");
			choices=input.next().charAt(0);
		}while(choices=='y' || choices=='Y');
	}
}
