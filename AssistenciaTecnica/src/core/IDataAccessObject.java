package core;

import java.util.ArrayList;

public interface IDataAccessObject<T> {
    public void create(T obj);
    public void delete(int id);
    public void update(T obj);
    public T read(int id);
    public ArrayList<T> list();
}
