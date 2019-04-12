import java.util.Scanner;

public class OldMagicSquare
{


    public static void print(int[][] a)
    {

        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                System.out.print("\t"+ a[i][j]);
            }
            System.out.println();

        }

    }



    public static void print(int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            System.out.print("\t"+ a[i]);
        }
        System.out.println();
    }

    public static boolean isMagicSquare(int[][] a)
    {
        int[] si = new int[a.length];
        int[] sj = new int[a.length];
        int[] sd = new int[a.length];

        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                si[i] += a[i][j];
                sj[j] += a[i][j];
            }
        }
        for (i = 0; i < a.length; i++)
        {
            sd[0] += a[i][i];
            sd[1] += a[i][a.length - 1 - i];
        }
        System.out.print("si: ");
        print(si);
        System.out.print("sj: ");
        print(sj);
        System.out.print("sd: ");
        print(sd);
        int t = si[0];
        for (i = 0; i < a.length; i++)
        {
            if (t != si[i] || t != sj[i])
            {
                return false;
            }
        }
        if (sd[0] != t || sd[1] != t)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[][] a = { { 6, 1, 2, }, { 1, 5, 3, }, { 2, 5, 4, }, };

        print(a);
        System.out.println("isMagicSquare(a) = " + isMagicSquare(a));


    }
}
