package Lab_6;
public class ThreadPriority extends Thread   
{   
	// Whenever the start() method is called by a thread  
	// the run() method is invoked  
	public void run()  
	{  
		System.out.println("Inside the run() method");  
	}    
	public static void main(String argvs[])  
	{   
		ThreadPriority th1=new ThreadPriority();  
		ThreadPriority th2=new ThreadPriority();  
		ThreadPriority th3=new ThreadPriority();  
		
		// We did not mention the priority of the thread.  
		// Therefore, the priorities of the thread is 5, the default value  
		// Display the priority of the thread  
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());    
		  
		// Setting priorities of above threads by  
		// passing integer arguments  
		th1.setPriority(MAX_PRIORITY);  
		th2.setPriority(MIN_PRIORITY);  
		th3.setPriority(9);  
		 
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
		System.out.println("Priority of the thread th3 is : " + th3.getPriority());    
	}  
}  