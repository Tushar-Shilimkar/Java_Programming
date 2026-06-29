/*
    Write a program to calculate the product of digit of a number.
*/
class Logic
{
    void productOfDigits(int num)
    {
        long product = 1;
        int temp = num;
        
        while(temp > 0)
        {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        
        System.out.println("Product of digits of " + num + " = " + product);
    }
}

class program96
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(2314);
    }
}