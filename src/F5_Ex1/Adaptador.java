package F5_Ex1;

/**
 * Created by rafa on 3/27/2017.
 */
public abstract class Adaptador implements IEstados
{
    @Override
    public IEstados up()
    {
        return this;
    }

    @Override
    public IEstados down()
    {
        return this;
    }

    @Override
    public boolean canGoUp()
    {
        return true;
    }

    @Override
    public boolean canGoDown()
    {
        return true;
    }


}
