package ru.mirea.IKBO2519.ex1;

public class Solution1 {
    public static int recursion(int n)
    {
        int N=n;
        if (N==1)
        {return 1;}
     while (N!=0)
     {
         System.out.println(n);
         N=N-1;
     }
        return recursion((n-1));
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
