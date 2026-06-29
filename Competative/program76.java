/*
    Write a program to find the sum of digits of a number.
*/
class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int temp = num;
        
        while(temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}

class program76
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}