package Assignment_Recursion_2_;

import java.util.Scanner;

public class Remove_X
{
    public static String removeX(String str)
    {
        if (str.length() == 0)
            return str;

        if (str.charAt(0) == 'x')
        {
            return removeX(str.substring(1));
        }

        return  str.charAt(0)+removeX(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String a = scan.next();
        System.out.println("After Removing x : "+ removeX(a));
    }
}
