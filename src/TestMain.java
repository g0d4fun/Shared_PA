/**
 * Created by henri on 3/9/2017.
 */
public class TestMain
{
    private int a;
    private char c;

    TestMain()
    {

    }
    public int getA()
    {
        return a;
    }
    public char getC()
    {
        return c;
    }

    public static void main(String[] args)
    {
        char c;
        int a;

        TestMain obj = new TestMain();

        System.out.println("Character: " + obj.getC() +  ".");
    }
}
