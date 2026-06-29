/*
    Write a program to print each digit of a number seprately.
*/
class Logic
{
    void printDigits(int num)
    {
        System.out.println("Digits of " + num + ":");
        
        while(num > 0)
        {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
    }
}

class program89
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}