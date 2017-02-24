import java.util.Scanner;

/**
 * Created by henri on 2/24/2017.
 */
public class F1_ex5
{
    private static int prizeNumbers [] = new int [5];
    private int choosenNums [];

    public F1_ex5()
    {
        choosenNums = new int [5];
    }

    public boolean newPrizeNumbers()
    {
        String prizeNums = "";

        for(int i = 0; i < prizeNumbers.length ; i++)
            do
            {
                prizeNumbers[i] = (int) (Math.random()*(49) + 1);
                for(int j = 0; j < i; j++)
                    if(prizeNumbers[i] == prizeNumbers[j])
                        continue;
            }while(true);

        return true;
    }

    public boolean play()
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < choosenNums.length ; i++)
            choosenNums[i] = sc.nextInt();

        return true;
    }

    public static void main(String[] args)
    {

    }
}
