import java.io.*;
import java.util.*;

class program662
{
    public static void main(String A[])
    {
        File fobj = null;
        boolean bRet = false;
        String Fname = null;
        Scanner sobj = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");

        Fname = sobj.nextLine();
        
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