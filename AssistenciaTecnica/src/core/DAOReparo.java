package core;

import java.util.ArrayList;

public class DAOReparo implements IDataAccessObject<Reparo> {

    ArrayList<Reparo> reparos;

    public DAOReparo(ArrayList<Reparo> reparos) {
        this.reparos = reparos;
    }

    @Override
    public void create(Reparo obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Reparo obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Reparo read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Reparo> list() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
