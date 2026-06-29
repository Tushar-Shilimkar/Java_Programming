/*
    Write a program to display all factors of given number.
*/
class Logic
{
    void displayFactors(int num)
    {
        System.out.println("Factors of " + num + ":");
        
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i);
        }
    }
}

class program98
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
