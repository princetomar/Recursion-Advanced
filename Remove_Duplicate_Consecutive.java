package Recursion_2_Lecture15;

import java.util.Scanner;

public class Remove_Duplicate_Consecutive
{
    public static String removeconsecutive(String str)
    {
        if (str.length() <= 1)
            return str;

        if (str.charAt(0) == str.charAt(1))
        {
            return removeconsecutive(str.substring(1));
        }

        else {
            return (str.charAt(0) +removeconsecutive( str.substring(1)));
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scan.next();

        System.out.println("After removing consecutive charachters : "+removeconsecutive(str));
    }
}
