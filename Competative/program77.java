/*
    Write a program to check whether a number is a palindrome or not.
*/
class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int reversed = 0;
        
        while(num > 0)
        {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        if(original == reversed)
        {
            System.out.println(original + " is a palindrome");
        }
        else
        {
            System.out.println(original + " is not a palindrome");
        }
    }
}

class program77
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}