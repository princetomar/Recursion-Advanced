package Assignment_Recursion_2_;

public class Charachter_to_Int
{
    static int char_to_int(String no)
    {
        int len = no.length();
        if (no.length() <= 0)
            return 0;

        int small = char_to_int(no.substring(0,len-1));
        int next = no.charAt(len-1) - '0';
        return small*10 + next;
    }

    public static void main(String[] args) {
        String s= "1234";
        System.out.println("Integer value : "+ char_to_int(s));
    }
}
