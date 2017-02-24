import java.util.Scanner;

public class F1_ex2
{
    public final static int MIN = 0;
    public final static int MAX = 100;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int hint, option = 0, inf, sup;
                        
        /* Inicie inf e sup */
        inf = 0;
        sup = 100;

        System.out.println("Pense num numero inteiro entre " + MIN + " e " + MAX + ".");

        do{
            /* Apresente um palpite com base nos valores de inf e sup*/
            hint = (int) (Math.random()*(sup - inf) + 1) + inf;

            System.out.println();
            System.out.println("Palpite: " + hint);

            System.out.println();
            System.out.println("1 - Palpite certo");
            System.out.println("2 - Palpite demasiado baixo");
            System.out.println("3 - Palpite demasiado alto");
            System.out.println();

            do
            {
                System.out.print("> ");
                /* Obtenha a resposta do utilizador */
                if(sc.hasNextInt())
                    option = sc.nextInt();
                else
                    continue;
            }while(option < 1 || option > 3);

            if(option == 2)
                inf = hint;
            else if(option == 3)
                sup = hint;

        }while(option != 1 && inf < sup);

        System.out.println();

        if(inf > sup)
            System.out.println("Respostas dadas inconsistentes!");
        else
            System.out.print("Resposta: " + (inf==sup ? inf:hint));

    }

}