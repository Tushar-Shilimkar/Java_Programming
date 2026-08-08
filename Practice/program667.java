import java.io.*;

class program667
{
    public static void main(String A[]) throws IOException
    {
        FileReader frobj = null;

        try
        {
            frobj = new FileReader("Demo.txt");

            System.out.println((char)frobj.read());
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