package Lab_6;
import java.util.ArrayList;
import java.util.List;

class SharedBuffer 
{
  private List<Integer> buffer = new ArrayList<>();
  private static final int CAPACITY = 5;

  // Synchronized method for the producer to produce data
  public synchronized void produce(int item) 
  {
      try 
      {
          // Wait if the buffer is full
          while (buffer.size() == CAPACITY) 
          {
              System.out.println("Buffer is full. Producer is waiting...");
              wait();
          }

          // Produce and add the item to the buffer
          buffer.add(item);
          System.out.println("Produced: " + item);

          // Notify the consumer that the buffer has items
          notifyAll();
      } 
      catch (InterruptedException e) 
      {
          e.printStackTrace();
      }
  }

  // Synchronized method for the consumer to consume data
  public synchronized void consume() 
  {
      try 
      {
          // Wait if the buffer is empty
          while (buffer.isEmpty())
          {
              System.out.println("Buffer is empty. Consumer is waiting...");
              wait();
          }

          // Consume and remove the item from the buffer
          int item = buffer.remove(0);
          System.out.println("Consumed: " + item);

          // Notify the producer that the buffer has space
          notifyAll();
      } 
      catch (InterruptedException e)
      {
          e.printStackTrace();
      }
  }
}

class Producer implements Runnable 
{
  private SharedBuffer sharedBuffer;

  public Producer(SharedBuffer sharedBuffer)
  {
      this.sharedBuffer = sharedBuffer;
  }

  @Override
  public void run() 
  {
      for (int i = 1; i <= 10; i++) 
      {
          sharedBuffer.produce(i);
      }
  }
}

class Consumer implements Runnable 
{
  private SharedBuffer sharedBuffer;

  public Consumer(SharedBuffer sharedBuffer) 
  {
      this.sharedBuffer = sharedBuffer;
  }

  @Override
  public void run() 
  {
      for (int i = 1; i <= 10; i++) 
      {
          sharedBuffer.consume();
      }
  }
}

public class ProducerConsumer
{
  public static void main(String[] args) 
  {
      SharedBuffer sharedBuffer = new SharedBuffer();

      // Create producer and consumer threads
      Thread producerThread = new Thread(new Producer(sharedBuffer));
      Thread consumerThread = new Thread(new Consumer(sharedBuffer));

      // Start the threads
      producerThread.start();
      consumerThread.start();
  }
}