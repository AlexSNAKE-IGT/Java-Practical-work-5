package ru.mirea.IKBO2519.ex1;

public class Solution10
{
    public static int recursion(int n, int i)
    {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args)
    {
        System.out.println(recursion(158, 0));
    }
}