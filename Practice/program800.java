
import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;
    
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix Constructor");

        this.iRow = iRow;
        this.iCol = iCol;
        
        Arr = new int[iRow][iCol];
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

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int SummationAll()
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public void SummationRow()
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Summation of Row no : "+i+ " is : "+iSum);
            iSum = 0;
        }
    }

    public int MaximumAll()
    {
        int iMax = 0;

        iMax = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(iMax < Arr[i][j])
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }

    public int MinimumAll()
    {
        int iMin = 0;

        iMin = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(iMin > Arr[i][j])
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
}

class program800
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0, j = 0;
        int iRow = 0;
        int iCol = 0;
        int iRet = 0;

        System.out.println("Enter number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();

        System.out.println("Summation of all elements :"+ iRet);

        mobj.SummationRow();

        iRet = mobj.MaximumAll();

        System.out.println("Maximum number is : "+iRet);

        iRet = mobj.MinimumAll();

        System.out.println("Minimum number is : "+iRet);
        
        mobj = null;

        System.gc();

    }
}