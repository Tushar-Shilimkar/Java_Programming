/*
    Write a program to calculate the power of a number using loops.
*/
class Logic
{
    void calculatePower(int base, int exp)
    {
        long power = 1;
        
        for(int i = 0; i < exp; i++)
        {
            power *= base;
        }
        
        System.out.println(base + " raised to the power " + exp + " = " + power);
    }
}

class program90
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}