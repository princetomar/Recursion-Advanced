package Assignment;

import java.util.Scanner;

public class Palindrome
{
    public static boolean IsPalindrome(String str)
    {
        if(str.length() <= 1)
            return true;
        else {
            if (str.charAt(0) == str.charAt(str.length()-1))
                return IsPalindrome(str.substring(1,str.length()-1));

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scan.next();
        System.out.print("Palindrome result : "+IsPalindrome(str));
    }
}
