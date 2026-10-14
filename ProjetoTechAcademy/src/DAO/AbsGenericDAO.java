package DAO;

import java.util.ArrayList;

public abstract class AbsGenericDAO<T> {

    public abstract ArrayList<T> Browse();

    public abstract T Read(int codigo);

    public abstract T Edit(T alterado);

    public abstract T Add(T novo);

    public abstract T Delete(T apagado);

}
