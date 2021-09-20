package Assignment;

import java.util.Scanner;

public class Multiplication
{
    public static int multiply(int a,int b)
    {
        if(a==0 || b==0)
            return 0;

        return (a+multiply(a,b-1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number 1 : ");
        int a = scan.nextInt();

        System.out.print("enter number 2 : ");
        int b = scan.nextInt();

        System.out.println("result : "+multiply(a,b));
    }
}
