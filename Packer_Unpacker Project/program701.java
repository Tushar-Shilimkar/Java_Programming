
class program701
{
    public static void main(String A[]) 
    {
        String header = "marvellous";

        System.out.println(header);

        header = header.replaceAll("l", "L");        // Issue Resolved

        System.out.println(header);
    }
}