package F5_Ex1b;

import F5_Ex1.*;

/**
 * Created by rafa on 3/29/2017.
 */
public abstract class IE_Adaptador implements IEstados
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
    public IEstados error()
    {
        return null;
    }

    @Override
    public IEstados safetyKey()
    {
        return this;
    }

    @Override
    public boolean canGoDown()
    {
        return false;
    }

    @Override
    public boolean canGoUp()
    {
        return false;
    }
}
