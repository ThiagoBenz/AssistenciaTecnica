package core;

import java.util.ArrayList;

public class DAOPagamento implements IDataAccessObject<Pagamento> {

    ArrayList<Pagamento> pagamentos;

    public DAOPagamento(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public void create(Pagamento obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Pagamento obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Pagamento read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Pagamento> list() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
