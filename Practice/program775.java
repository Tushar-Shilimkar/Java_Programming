import java.util.*;

class program775
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        HashMap <Character, Integer> hobj = new HashMap <Character, Integer>();
        
        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch) == false)
            {
                hobj.put(ch,1);
            }
            else
            {
                int temp = hobj.get(ch);

                temp++;

                hobj.put(ch,temp);
            }
        }

        int iMax = 0;
        char temp = '\0';

        for(char cValue : hobj.keySet())
        {
            if(hobj.get(cValue) > iMax)
            {
                iMax = hobj.get(cValue);
                temp = cValue;
            }
        }

        System.out.println(temp + "occurs maximum times ie : "+iMax);
    }
}