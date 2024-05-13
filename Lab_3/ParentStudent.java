package Lab_3;
class Parent   // Superclass
{
	String name="Shubham";
	int age=21;
	void speak()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
}

class Student extends Parent // subclass of Parent class
{
	char grade='A';
	void study()
	{
		super.speak();  // calling superclass methods
		System.out.println("Grade="+grade);
	}
}
public class ParentStudent {

	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.study();
	}

}
