package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, -1, 5, 3, 6, -7, 2, 3, 3, 9};
        for (int n : remove (a, 3))
            System.out.print (n + " ");
    }

    static int[] remove (int[] in, int x)
    {
        //elements of 'in' equal to x removed and zeros added to the end
        int[] out = new int [in.length];
        for (int i = 0, endZeros = 0; i < in.length; i++)
        {
            if (in [i] == x)
            {
                out [out.length - 1 - endZeros] = 0;
                endZeros++;
            }
            else
                out [i - endZeros] = in [i];
        }
        return out;
    }
}
