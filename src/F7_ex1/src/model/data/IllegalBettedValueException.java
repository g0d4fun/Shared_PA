package F7_ex1.src.model.data;

/**
 * Created by rafa on 4/19/2017.
 */
public class IllegalBettedValueException extends Exception
{
    int maxValue;

    public IllegalBettedValueException(int max)
    {
        maxValue = max;
    }

    @Override
    public String toString()
    {
        return "Value shall not be larger than " + maxValue;
    }
}
