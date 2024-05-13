package Lab_5;
import java.io.IOException;
public class ChainedException 
{
    public static void main(String[] args) throws Throwable {
        try 
        {
            throw new ArithmeticException("Top Level Exception.")
              .initCause(new IOException("IO cause."));
        }
        catch(ArithmeticException ae) 
        {
            System.out.println("Caught : " + ae);
            System.out.println("Actual cause: "+ ae.getCause());
        }
    }    
}