package Assignment_Recursion_2_;

import java.util.Scanner;

public class Replace_pi_
{
    public static String ReplacePi(String str)
    {
        String output;
        if (str.length() <= 1)
            return str;

        String small = ReplacePi(str.substring(1));
        if (str.charAt(0) =='p' && small.charAt(0) == 'i')
        {
            output = "3.14" + small.substring(1);
        }
        else
        {
            output = str.charAt(0) + small;
        }

        return output;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String a = scan.next();
        System.out.println("After Replacing pi : "+ ReplacePi(a));
    }
}
