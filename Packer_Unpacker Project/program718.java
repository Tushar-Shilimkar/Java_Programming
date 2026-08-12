import java.util.*;

class StringX
{
    int CountWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        return Tokens.length;
    }

    void DisplayWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for (int i = 0; i < Tokens.length; i++)
        {
            System.out.println(Tokens[i]+":"+Tokens[i].length());
        }
    }

    void LargestWords(String str)
    {
        int iMax = 0;
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for (int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > iMax)
            {
                iMax = Tokens[i].length();
            }
        }

        System.out.println("Largest word length is : "+iMax);
    }

    void PatternMatching(String str, String word)
    {
        int iCount = 0;
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for (int i = 0; i < Tokens.length; i++)
        {
            if(word.equals(Tokens[i]))
            {
                iCount++;
            }
        }

        return iCount;
    }
    
}   

class program718
{
    public static void main(String A[]) 
    {
        StringX strobj = new StringX();
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        iRet = strobj.CountWords(str);

        System.out.println("Number of words are : "+iRet);

        strobj.DisplayWords(str);

        iRet = strobj.PatternMatching(str, "are");

        System.out.println("Frequency of the word is : "+iRet);
    }
}