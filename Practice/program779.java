
import java.util.HashMap;
import java.util.Scanner;


class program779
{
    public static void main(String A[])
    {
        HashMap <String, Integer> hobj = new HashMap <String, Integer>();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replace("\\s+", " ");

        String Tokens[] = str.split(" ");

        for(String s : Tokens)
        {
            if(hobj.containsKey(s) == false)
            {
                hobj.put(s,1);
            }
            else
            {
                int temp = hobj.get(s);

                temp++;

                hobj.put(s, temp);
            }
        }

        System.out.println(hobj);
    }
}