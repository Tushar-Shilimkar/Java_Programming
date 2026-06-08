import java.util.*;

class ArrayX
{
    public void Update(Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           Arr[iCnt]++;
        }
    }
}

public class program147
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        System.out.println("The array Before function call is: ");

        int Brr[] = {10,20,30,40};
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }    
    ArrayX aobj = new ArrayX();
    ArrayX.Update(Brr);

    System.out.println("Element of array After function is:");

    for(iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
}
