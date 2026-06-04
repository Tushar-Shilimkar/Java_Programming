import java.util.*;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        for(; iNo > 0; iNo = iNo / 10 )
        {
            System.out.println(iNo % 10);
        }

    }
}

class program82
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigits(iValue);
    }
}