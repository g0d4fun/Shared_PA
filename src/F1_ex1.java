import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * My First Java Class
 * Created by henri on 2/22/2017.
 */
public class F1_ex1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int answer = -1;
        int num;
        final int inf = 0;
        final int sup = 100;

        num = (int) (Math.random()*(sup-inf + 1) + inf);

        do
        {
            do
            {
                System.out.println("Insert a number: ");
                System.out.print("> ");

                try
                {
                    answer = sc.nextInt();
                }catch(InputMismatchException ex)
                {
                    answer = -1;
                    sc.next();
                    continue;
                }
            }while(answer < 0 || answer > 100);

            if(answer > num)
                System.out.println("Wrong Number. Number is lower.");
            else if(answer < num)
                System.out.println("Wrong Number. Number is higher");

        }while(answer != num);

        System.out.println("\n\tYOU WON\n\tThe right number was " + num);
    }
}
