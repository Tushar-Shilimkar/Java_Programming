import java.util.*;

class program776
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

        char Brr[] = new char[hobj.size()];

        int i = 0;
        
        for(char cValue : hobj.keySet())
        {
            Brr[i] = cValue;
            i++;
        }


        System.out.println(new String(Brr));
    }
}