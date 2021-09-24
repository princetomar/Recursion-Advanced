package Recursion_2_Lecture15;

import java.util.Scanner;

public class ReplaceCharachter
{
    public static String replacechar(String str, char c1, char c2)
    {
        if (str.length() == 0)
            return str;
        String output = "";
        if (str.charAt(0) == c1)
        {
            output += c2;
        }else {
            output += str.charAt(0);
        }

        String smallAns = replacechar(str.substring(1),c1,c2);

        return output+smallAns;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string str : ");
        String str = scan.next();
        System.out.print("enter 1st char : ");
        char a = scan.next().charAt(0);
        System.out.print("enter 2nd char : ");
        char b = scan.next().charAt(0);

        System.out.println("Result String : "+replacechar(str,a,b));

    }
}
