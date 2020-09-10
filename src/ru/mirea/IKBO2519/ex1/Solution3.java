package ru.mirea.IKBO2519.ex1;

public class Solution3
{
    public static String recursion(int a, int b)
    {
        if (a > b)
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else
            {
                if (a == b)
             {
                    return Integer.toString(a);
             }
            return a + " " + recursion(a + 1, b);
            }
    }
    public static void main(String[] args)
    {
        System.out.println(recursion(20, 15));
        System.out.println(recursion(10, 15));
    }
}
