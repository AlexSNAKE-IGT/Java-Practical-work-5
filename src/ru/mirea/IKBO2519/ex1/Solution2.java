package ru.mirea.IKBO2519.ex1;
public class Solution2 {
    public static int recursion(int n,int q)
    {
        if (q!=n)
        {
            System.out.print(q);
            q++;
        return recursion(n,q);
        }
        else
        {
            return n;
        }
    }

    public static void main(String[] args) {
        int q =1;
        System.out.println(recursion(5,1));
    }
}
