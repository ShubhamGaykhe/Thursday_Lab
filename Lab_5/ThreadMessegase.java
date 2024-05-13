package Lab_5;

public class ThreadMessegase extends Thread
{
	private String message;
    public ThreadMessegase(String message) 
    {
        this.message = message;
    }

    public void run() 
    {
    	while (true) 
        {
    		System.out.println(message);
            try 
            {
				Thread.sleep(1000);
			}
            catch (InterruptedException e)
            {
				e.printStackTrace();
			} // Adjust the sleep time as needed
        }
    }
	public static void main(String[] args) 
	{
		try 
		{
            // Create two threads with different messages
			ThreadMessegase thread1 = new ThreadMessegase("Thread 1: Hello!");
			ThreadMessegase thread2 = new ThreadMessegase("Thread 2: Hi!");

            // Start the threads
            thread1.start();
            thread2.start();

            // Wait for user to press Ctrl+C
            while (true) 
            {
                Thread.sleep(1000); // Adjust the sleep time as needed
            }
        } 
		catch (InterruptedException e) 
		{
            // Main thread interrupted, exit gracefully
			e.printStackTrace();
        }
	}
}
