package Lab_4;
//abstract class 
abstract class ServiceCenter
{
	private int CarNum,ChassiNum;
	public String CarModel,FuelType;
	public abstract void CarDetails(); // abstract method
	
	// getter setter methods
	public int getCarNum() 
	{
		return CarNum;
	}
	public void setCarNum(int carNum) 
	{
		CarNum = carNum;
	}
	public int getChassiNum() 
	{
		return ChassiNum;
	}
	public void setChassiNum(int chassiNum) 
	{
		ChassiNum = chassiNum;
	}
}
