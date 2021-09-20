package Assignment;

import java.util.Scanner;

public class GeometricSum
{
    public static double geoSum(int n)
    {
        if (n == 0)
            return 1;

        return geoSum(n-1)+ (1/Math.pow(2,n));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter num : ");
        int n = scan.nextInt();
        System.out.print("geometric sum : "+geoSum(n));
    }
}
