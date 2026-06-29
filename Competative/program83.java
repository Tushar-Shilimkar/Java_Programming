/*
    Write a program to print all odd numbers up to N.
*/
class Logic
{
    void printOddNumbers(int n)
    {
        System.out.println("Odd numbers up to " + n + ":");
        for(int i = 1; i <= n; i += 2)
        {
            System.out.println(i);
        }
    }
}

class program83
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}