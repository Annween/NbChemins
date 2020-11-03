import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        String[] tab = new String[M]; // on déclare un tableau pour sauvegarder nos résultats
        if (in.hasNextLine())
        {
            in.nextLine();
        }
        for (int i = 0; i < M; i++)
        {
            tab[i] = in.nextLine();
        }



        System.out.println(in.nextLine());

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        System.out.println(NbChemins(0, 1,10,10, tab));
    }

    static int NbChemins(int a, int b, int M, int N, String tab[]) // a et b sont les coordonnées d'une case
    {

        if (a == N || b == M )
            return 0; // chemin impossible

        if (a == N-1 && b == M-1)
            return 1; // Chemin accessible

        if (tab[b].charAt(a) == 1)
            return 0; // chemin inaccessible car la case contient 1

        return NbChemins(M - 1, N, M, N, tab) + NbChemins(M, N-1, M,N, tab);
    }


}
