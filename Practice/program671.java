import java.io.*;
import java.util.Scanner;

class program671
{
    public static void main(String A[]) throws IOException
    {
        String Fname = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File Name : "+fobj.getName());
            System.out.println("Abolute path : "+fobj.getAbsolutePath());
            System.out.println("File Size : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}