package Assignment_Recursion_2_;

public class Place_Star
{
    static String placeStar(String str)
    {
        if (str.length() <= 1)
            return str;
        String output = "";
        String small = placeStar(str.substring(1));
        if (str.charAt(0) == small.charAt(0))
        {
            output = str.charAt(0) + "*"+small;
        }
        else {
            output = str.charAt(0)+small;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(placeStar("aaaaa"));
    }
}
