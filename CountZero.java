package Assignment;

public class CountZero
{
    public static  int zerocount(int n)
    {
        if (n < 10)
        {
            if (n == 0)
                return 1;
            else
                return 0;
        }

        if (n % 10 == 0)
        {
            return zerocount(n/10)+1;
        }
        else
            return zerocount(n/10);

    }

    public static void main(String[] args) {
        int n= 10204;
        System.out.println("result : "+zerocount(n));
    }
}
