package ru.mirea.IKBO2519.ex1;

public class Solution16
{
    public static void recursion(int max, int count)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0)
        {
            if (n > max)
            {
                recursion(n, 1);
            }
            else if (n == max)
            {
                recursion(max, ++count);
            }
            else
            {
                recursion(max, count);
            }
        }
        else
        {
            System.out.println(count);
        }
    }
    public static void main(String[] args)
    {
        recursion(0, 0);
    }
}
