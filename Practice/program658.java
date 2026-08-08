import java.io.*;

class program658
{
    public static void main(String A[]) throws IOException
    {
        try
        {
            File fobj = new File("Demo.txt");

            if(fobj.exists())
            {
                System.out.println("File already present");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File Get successfully created");   
            }

            fobj.createNewFile();       // Exception
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }     
    }
}