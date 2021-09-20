package Assignment;

public class SumOfDigitsOfNumber
{
    public static int sum(int n)
    {
        if (n < 10)
        {
            return n;
        }

        int last = n%10;
        return last+sum(n/10);
    }

    public static void main(String[] args) {
        System.out.println("result : "+sum(9));
    }
}
