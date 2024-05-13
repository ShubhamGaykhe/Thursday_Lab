package Lab_5;
class SecondObject {
    private static SecondObject instance;

    private SecondObject() 
    {
        // Private constructor to prevent instantiation outside of this class
    }

    public static SecondObject getInstance() throws SingleObject 
    {
        if (instance == null) 
        {
            instance = new SecondObject();
            return instance;
        } 
        else 
        {
            throw new SingleObject("Only one object can be created.");
        }
    }
}

class SingleObject extends Exception {
    public SingleObject(String message) 
    {
        super(message);
    }
    public static void main(String[] args) 
    {
        try 
        {
        	SecondObject obj1 = SecondObject.getInstance();
            System.out.println("Object 1 created successfully.");

            // Uncommenting the next line will result in an exception
            SecondObject obj2 = SecondObject.getInstance();
        } 
        catch (SingleObject e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}