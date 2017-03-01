package F1;

import java.util.Scanner;

public class F1_ex6
{

    public final static int MAX_VALOR = 100;

    public static void preencheAleatorioMatriz(int [][]m)
    {
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[i].length ; j++)
            {
                m[i][j] = (int) ((Math.random()*MAX_VALOR) + 1);
            }
    }

    public static int [][]somaParMatrizes(int [][]m1, int [][]m2)
    {
        if(m1.length == 0 || m2.length == 0)
            return null;

        for(int i = 0; i < m1.length; i++)
            if(m1[i].length != m2[i].length)
                return null;

        int [][]soma;

        soma = new int [m1.length][m1[0].length];

        for(int i = 0; i < m1.length; i++)
            for(int j = 0; j < m1[i].length ; j++)
            {
                soma[i][j] = m1[i][j] + m2[i][j];
            }

        return soma;
    }

    public static void visualizaMatriz(int [][]m)
    {
        System.out.println("Array: ");

        for(int i = 0; i < m.length; i++)
        {
            System.out.print("[ ");
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.printf("%4d",m[i][j]);
            }

            System.out.print("]");
            System.out.println();
        }


    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nLinhas, nColunas;
        int [][] m1, m2, soma;

        System.out.print("Numero de linhas (1-10): ");
        nLinhas = sc.nextInt();

        if(nLinhas<1 || nLinhas>10){
            System.out.println("Apenas valores entre 1 e 10!");
            System.exit(0);
        }

        System.out.print("Numero de colunas (1-10): ");
        nColunas = sc.nextInt();

        if(nColunas<1 || nColunas>10){
            System.out.println("Apenas valores entre 1 e 10!");
            System.exit(0);
        }

        m1 = new int[nLinhas][nColunas];
        m2 = new int[nLinhas][nColunas];

        preencheAleatorioMatriz(m1);
        preencheAleatorioMatriz(m2);

        soma = somaParMatrizes(m1, m2);

        visualizaMatriz(m1);
        System.out.println("\r\n\t+\r\n");
        visualizaMatriz(m2);
        System.out.println("\r\n\t=\r\n");
        visualizaMatriz(soma);
    }

}
