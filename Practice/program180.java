// Pattern Printing

// Output : a    b   c   d   e   f   g

import java.util.*;

class program180
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'a'; iCnt <= iNo; ch++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements :");
        iValue = sobj.nextInt();

        Display(iValue);

    }
}
