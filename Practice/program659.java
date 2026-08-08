import java.io.*;

class program659
{
    public static void main(String A[]) throws IOException
    {
        try
        {
            File fobj = new File("Demo.txt");
            boolean bRet = false;

            bRet = fobj.exists();

            if(bRet == true)
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