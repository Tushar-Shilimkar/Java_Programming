/*
    Write a program to find the sum of all even numbers up to N.
*/
class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;
        
        for(int i = 2; i <= n; i += 2)
        {
            sum += i;
        }
        
        System.out.println("Sum of all even numbers up to " + n + " = " + sum);
    }
}

class program91
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}