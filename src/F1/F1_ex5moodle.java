package F1;

import java.util.Arrays;

public class F1_ex5moodle
{
    public final static int MIN_VALUE = 1;
    public final static int MAX_VALUE = 49;
    public final static int TAM_APOSTA = 6;

    protected int [] aposta;
    protected int numPreenchidos;

    public F1_ex5moodle()
    {
        aposta = new int [TAM_APOSTA];
        numPreenchidos = 0;
    }

    protected boolean preencheNumero(int numero)
    {
        if(this.apostaCompleta() || this.numeroJaPreenchido(numero))
            return false;

        aposta[numPreenchidos++] = numero;
        return true;
    }

    public boolean numeroJaPreenchido(int numero)
    {
        if(numero < 1 || numero > 49)
            return false;

        for(int i : aposta)
            if(numero == i)
                return true;

        return false;

    }

    public boolean apostaCompleta()
    {
        if(numPreenchidos == 6)
            return true;
        else
            return false;
    }

    public int getNumero(int indice)
    {
        if(indice < 0 || indice > numPreenchidos)
            return 0;

        return aposta[indice];
    }

    public int [] getNumeros()
    {
       return aposta;
    }

    public void geraApostaAutomatica()
    {
        numPreenchidos = 0;

        while(numPreenchidos < TAM_APOSTA)
            this.preencheNumero((int) (Math.random()*(MAX_VALUE-MIN_VALUE) + MIN_VALUE));

    }

    //Devolve a quantidade de numeros em comum.
    public int comparaComOutraAposta(F1_ex5moodle outrAposta)
    {
        int equals = 0;

        for(int i = 0; i < numPreenchidos; i++)
            for(int j = 0; j < outrAposta.numPreenchidos; j++)
                if (aposta[i] == outrAposta.aposta[j])
                {
                    equals++;
                    break;
                }


        return equals;
    }

    public void mostraAposta()
    {
        int aux [];

        /*
        aux = new int [TAM_APOSTA];
        System.arraycopy(aposta, 0, aux, 0, TAM_APOSTA) // Start in 0 index, this case
        */

        aux = Arrays.copyOf(aposta,TAM_APOSTA);
        Arrays.sort(aux);

        System.out.format("[%3s",aux[0]); // Format String

        for(int i = 1; i < TAM_APOSTA; i++)
            System.out.format(" %3s", aux[i]);

        System.out.println("]");

    }


    public static void main(String args[])
    {

        F1_ex5moodle aposta1 = new F1_ex5moodle();
        F1_ex5moodle aposta2 = new F1_ex5moodle();

        aposta1.geraApostaAutomatica();

        while(!aposta2.apostaCompleta())
        {
            aposta2.preencheNumero((int)(Math.random()*MAX_VALUE)+1);
        }

        aposta1.mostraAposta();
        System.out.println();
        aposta2.mostraAposta();
        System.out.println();
        System.out.println("As duas apostas tem " + aposta1.comparaComOutraAposta(aposta2) + " numeros em comum.");

    }
}
