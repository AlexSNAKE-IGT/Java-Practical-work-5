package ru.mirea.IKBO2519.ex1;

public class Solution6
{
    private static int recursion(int n, int var)
    {
        if (n > 1)
        {
            if (n % var != 0)
            {
                return recursion(n, var+1);
            } else if (n % var == 0)
            {
                if (var == n)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        recursion(12345678,2);
    }
}
