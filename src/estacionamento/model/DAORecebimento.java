package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAORecebimento implements DAO{
    private ConnectionFactory conn;
    
    public DAORecebimento(){
        this.conn = new ConnectionFactory();
    }
    
    @Override
    public Object save(Object o) throws Exception {
        Connection c  = conn.getConnection();
        Recebimento r = (Recebimento) o;
        String sql = "INSERT INTO recebimentos (valor, data, fkCliente, fkFluxo) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDouble(1, r.getValor());
        stmt.setDate(2, new java.sql.Date(r.getData().getTime()));
        
        Object idCliente = null;
        if(r.getIdCliente() != 0){
            idCliente = r.getIdCliente();
        }
        stmt.setObject(3, idCliente);
        Object idFluxo = null;
        if(r.getIdFluxo() != 0){
            idFluxo = r.getIdFluxo();
        }
        stmt.setObject(4, idFluxo);
        stmt.execute();
        stmt.close();
        conn.close();
        return null;
    }

    @Override
    public void update(Object o) throws Exception {
        Connection c = conn.getConnection();
        Recebimento r = (Recebimento) o;
        String sql = "UPDATE recebimentos SET valor = ?, data =  ?, fkCliente = ?, fkFluxo = ? WHERE idRecebimentos = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDouble(1, r.getValor());
        stmt.setDate(2, new java.sql.Date(r.getData().getTime()));
        
       Object idCliente = null;
        if(r.getIdCliente() != 0){
            idCliente = r.getIdCliente();
        }
        stmt.setObject(3, idCliente);
        Object idFluxo = null;
        if(r.getIdFluxo() != 0){
            idFluxo = r.getIdFluxo();
        }
        stmt.setObject(4, idFluxo);
        stmt.setInt(5, r.getIdRecebimentos());
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public void delete(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "DELETE FROM recebimentos where idRecebimento = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public Object findById(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM recebimentos where idRecebimento = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        Recebimento r = null;
        while(result.next()){
            r = new Recebimento();
            r.setValor(result.getDouble(1));
            r.setData(new java.util.Date(result.getDate(2).getTime()));
            r.setIdCliente(result.getInt(3));
            r.setIdFluxo(result.getInt(4));
        }
        result.close();
        stmt.close();
        conn.close();
        return r;
    }

    @Override
    public List<Recebimento> selectALL() throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM recebimentos";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Recebimento> recebimentos = new ArrayList<>();
        while(result.next()){
            Recebimento r = new Recebimento();
            r.setIdRecebimentos(result.getInt(1));
            r.setValor(result.getDouble(2));
            r.setData(new java.util.Date(result.getDate(3).getTime()));
            r.setIdCliente(result.getInt(4));
            r.setIdFluxo(result.getInt(5));
            recebimentos.add(r);
        }
        result.close();
        stmt.close();
        conn.close();
        return recebimentos;
    }
    
    public List<Recebimento> selectALLInInterval(Date inicio, Date fim) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM recebimentos WHERE date(data) between ? and ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDate(1, new java.sql.Date(inicio.getTime()));
        stmt.setDate(2, new java.sql.Date(fim.getTime()));
        ResultSet result = stmt.executeQuery();
        ArrayList<Recebimento> recebimentos = new ArrayList<>();
        while(result.next()){
            Recebimento r = new Recebimento();
            r.setIdRecebimentos(result.getInt(1));
            r.setValor(result.getDouble(2));
            r.setData(new java.util.Date(result.getDate(3).getTime()));
            r.setIdCliente(result.getInt(4));
            r.setIdFluxo(result.getInt(5));
            recebimentos.add(r);
        }
        result.close();
        stmt.close();
        conn.close();
        return recebimentos;
    }
    
    public List<Recebimento> findRecebimentosByCliente(Cliente cliente) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM recebimentos where fkCliente = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cliente.getIdCliente());
        ResultSet result = stmt.executeQuery();
        ArrayList<Recebimento> recebimentos = new ArrayList<>();
        while(result.next()){
            Recebimento r = new Recebimento();
            r.setIdRecebimentos(result.getInt(1));
            r.setValor(result.getDouble(2));
            r.setData(new java.util.Date(result.getDate(3).getTime()));
            r.setIdCliente(result.getInt(4));
            r.setIdFluxo(result.getInt(5));
            recebimentos.add(r);
        }
        result.close();
        stmt.close();
        conn.close();
        return recebimentos;
    }

}