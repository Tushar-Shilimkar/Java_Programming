
import java.util.Scanner;

class Matrix
{
    public int Arr[][];
    
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix Constructor");
        
        Arr = new int[iRow][iCol];
    }

    protected  void finalize()
    {
        System.out.println("Inside Finalize method");

        Arr = null;
        System.gc();
    }
}

class program790
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0, j = 0;
        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        /*System.out.println("Enter the elements of matrix: ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements of the matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }

            System.out.println();
        }*/
    }
}