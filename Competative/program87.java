/*
    Write a program to display the grade of a student based on marks.
*/
class Logic
{
    void displayGrade(int marks)
    {
        char grade;
        
        if(marks >= 90)
            grade = 'A';
        else if(marks >= 80)
            grade = 'B';
        else if(marks >= 70)
            grade = 'C';
        else if(marks >= 60)
            grade = 'D';
        else
            grade = 'F';
        
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

class program87
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}