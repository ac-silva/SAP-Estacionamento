package estacionamento.model;

import java.util.List;

public interface DAO {
    public Object save(Object o) throws Exception;
    public void update(Object o) throws Exception;
    public void delete(int id) throws Exception;
    public Object findById(int id) throws Exception;
    public List selectALL() throws Exception;
}
