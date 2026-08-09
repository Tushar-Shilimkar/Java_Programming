import java.io.*;

class program665
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fwobj = null;

        try{
            fwobj = new FileWriter("Demo.txt");
            fwobj.write("Jay Ganesh...");
            fwobj.close();
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {
            
        }
    }
}