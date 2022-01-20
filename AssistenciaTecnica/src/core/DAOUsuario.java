package core;

import java.util.ArrayList;

public class DAOUsuario implements IDataAccessObject<Usuario> {

    ArrayList<Usuario> usuarios;

    public DAOUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public void create(Usuario obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Usuario obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Usuario read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Usuario> list() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
