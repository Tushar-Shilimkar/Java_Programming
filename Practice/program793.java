
import java.util.*;

class Matrix
{
    private int Arr[][];
    private int iRow;
    private int iCol;
    
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix Constructor");

        this.iRow = iRow;
        this.iCol = iCol;
        
        Arr = new int[iRow][iCol];
    }

    protected  void finalize()
    {
        System.out.println("Inside Finalize method");

        Arr = null;
        System.gc();
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix: ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
  
    }

    public void Display()
    {
        System.out.println("Elements of the matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }

            System.out.println();
        }
    }
}

class program793
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

        mobj.Accept();
        mobj.Display();

        mobj = null;

        System.gc();

    }
}