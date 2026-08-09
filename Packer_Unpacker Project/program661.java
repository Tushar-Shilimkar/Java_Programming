import java.io.*;

class program661
{
    public static void main(String A[])
    {
        File fobj = null;
        boolean bRet = false;
        
        try
        {
            fobj = new File("Demo.txt");

            bRet = fobj.exists();

            if(bRet == true)
            {
                fobj.delete();
                System.out.println("File gets Deleted");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("There is no such File");   
            }

            fobj.createNewFile();       
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }     
    }
}