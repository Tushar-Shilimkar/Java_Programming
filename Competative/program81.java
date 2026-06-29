/*
    Write a program to check whether a number is prime or not.
*/
class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + " is not prime");
            return;
        }
        
        boolean isPrime = true;
        
        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}

class program81
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}