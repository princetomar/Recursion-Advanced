package Assignment_Recursion_2_;

import java.util.Scanner;

public class Tower_Of_Hanoi
{
    static void toh(int n,char source,char aux, char dest)
    {
        if (n == 0)
            return;
        toh(n-1,source, dest, aux);
        System.out.println(source+" "+dest);
        toh(n-1,aux,source,dest);
    }

    static void toh(int n)
    {
        toh(n,'a','b','c');
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = scan.nextInt();
        toh(n);
    }
}
