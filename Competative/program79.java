/*
    Write a program to find the minimum of three numbers.
*/
class Logic
{
    void findMin(int a, int b, int c)
    {
        int min = a;
        
        if(b < min)
            min = b;
        
        if(c < min)
            min = c;
        
        System.out.println("Minimum is: " + min);
    }
}

class program79
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}