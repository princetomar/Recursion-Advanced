package Recursion_2_Lecture15;

public class RemoveXfromString
{
    public static String removex(String str,char x)
    {

        if (str.length() == 0)
            return str;

        String output = "";
        if (str.charAt(0) != x)
        {
            output = output + str.charAt(0);
        }
        String smallAns = removex(str.substring(1),x);

        return output+smallAns;

    }

    public static void main(String[] args) {
        String abc = "abxcdex";
        String r = removex(abc,'x');
        System.out.println("result string : "+ r);
    }
}
