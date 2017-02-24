/**
 * Created by henri on 2/22/2017.
 */
public class F1_ex4
{
    public final static int ARRAY_LEN = 20;
    public final static int MAX_VALUE = 100;

    protected int [] a;
    protected int amountDuplicatedValues;

    public F1_ex4()
    {
        a = new int[ARRAY_LEN];
        amountDuplicatedValues = 0;

        for(int i = 0; i < a.length; i++)
            a[i] = -1;
        /*
        // foreach
        for(int i : a)
            i = -1;
         */
    }

    public void preencheArray()
    {
        for(int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random()*(MAX_VALUE + 1));

        for(int i = 0; i < a.length; i++)
            for(int j = i + 1; j < a.length; j++)

                if(a[i] == a[j])
                    amountDuplicatedValues++;

    }

    public boolean valorJaExistente(int valor)
    {

        for(int i = 0; i < a.length; i++)
            if(a[i] == valor)
                return true;

        return false;
    }

    public void listaConteudoArray()
    {
        int i;
        System.out.println("Array[" + ARRAY_LEN + "]: ");

        for(i = 0 ; i < (a.length - 1) ; i++)
            System.out.print(a[i] + ", ");

        System.out.print(a[i]);
    }

    public int getAmountDuplicatedValues()
    {
        return amountDuplicatedValues;
    }

    public static void main(String args[])
    {
        F1_ex4 array = new F1_ex4();
        array.preencheArray();

        array.listaConteudoArray();
        System.out.println();
        System.out.println("\nDuplicated numbers between generated ones: " + array.getAmountDuplicatedValues());

    }
}
