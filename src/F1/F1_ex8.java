package F1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F1_ex8
{
    public static final int MAX_LINHAS = 10;
    public static final int TAM_ESPACO_NUMERO = 4;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nLinhas, i, j;
        int [][] triangulo;

        System.out.print("Numero de linhas (1-"+MAX_LINHAS+"): ");

        try
        {
            nLinhas = sc.nextInt();
        }catch(InputMismatchException e)
        {
            System.out.println("Apenas valores inteiros!");
            return;
        }

        System.out.println();

        if(nLinhas > MAX_LINHAS || nLinhas < 1)
        {
            System.out.print("Apenas valores entre 1 e "+MAX_LINHAS+"!");
            return;
        }

        triangulo = new int [nLinhas][]; //Aloca apenas a primeira dimensao: nLinhas

        for(i=0; i<nLinhas; i++)
        {
            triangulo[i] = new int [i+1]; //Aloca o numero de colunas correspondentes 'a linha no indice i
            triangulo[i][0] = triangulo[i][i] = 1; //Coloca o valor 1 nos extremos da linha

            for(j=1; j<i; j++)
            {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j]; //Atribui os valores aos restantes elementos da linha tendo por base a linha anterior
            }
        }

        for(i=0; i<nLinhas; i++)
        {
            System.out.format("%"+((nLinhas-i)*TAM_ESPACO_NUMERO/2)+"s","");

            for(j=0; j<=i; j++){
                //System.out.print(triangulo[i][j]+"\t");
                System.out.format("%"+TAM_ESPACO_NUMERO+"s",triangulo[i][j]);
            }

            System.out.println();
        }

    }

}
