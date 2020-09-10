package ru.mirea.IKBO2519.ex1;

public class Solution8
{
    private static int recursion(String str, int i, int check)
    {
        char[] timeChar = str.toCharArray();
        if ((i == timeChar.length - 1) && (check == 1))
        {
            System.out.println("YES");
            return 0;
        }
        check = 0;
        if ((timeChar.length > i) && (timeChar[i] == timeChar[timeChar.length - i - 1]))
        {
            return recursion(str, i + 1, 1);
        } else
            System.out.println("NO");
        return 0;
    }
    public static void main(String[] args)
    {
        recursion("Порно",0,0);
    }
}
