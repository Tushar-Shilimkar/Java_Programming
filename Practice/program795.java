import Marvellous.Matrix;
import java.util.*;

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }
}
class program795
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

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        mobj = null;

        System.gc();

    }
}