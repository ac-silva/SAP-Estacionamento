package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DAOValores implements DAO{
    private ConnectionFactory conn;
    
    
    public DAOValores(){
        this.conn = new ConnectionFactory();
    }
    
    @Override
    public Object save(Object o) throws Exception{
        Valores v = (Valores) o;
        Connection c = conn.getConnection();
        String sql = "INSERT INTO valores(valor, descricao, tempo, tipo) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDouble(1, v.getValor());
        stmt.setString(2, v.getDescricao());
        stmt.setInt(3, v.getTempo());
        stmt.setString(4, v.getTipo());
        stmt.execute();
        stmt.close();
        conn.close();
        return null;
    }
    
    @Override
    public void update(Object o) throws Exception{
        Valores v = (Valores) o;
        Connection c = conn.getConnection();
        String sql = "UPDATE valores SET valor = ?, descricao = ? WHERE v.idValores = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDouble(1, v.getValor());
        stmt.setString(2, v.getDescricao());
        stmt.setInt(3, v.getIdValores());
        stmt.execute();
        stmt.close();
        conn.close();
    }
    
    @Override
    public void delete(int id) throws Exception{
        Connection c = conn.getConnection();
        String sql = "DELETE FROM valores WHERE idValores = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }
    
    @Override
    public Object findById(int id) throws Exception{
        Valores v = null;
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM valores WHERE idvalores = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            v = new Valores();
            v.setIdValores(result.getInt(1));
            v.setValor(result.getDouble(2));
            v.setDescricao(result.getString(3));
        }
        result.close();
        stmt.close();
        conn.close();
        return v;
    }
    
    public Object findByTipoAndTempo(String tipo, int tempo) throws Exception{
        Valores v = null;
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM valores WHERE tipo = ? AND tempo <= ? ORDER BY tempo DESC LIMIT 1";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, tipo);
        stmt.setInt(2, tempo);
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            v = new Valores();
            v.setIdValores(result.getInt(1));
            v.setValor(result.getDouble(2));
            v.setDescricao(result.getString(3));
        }
        result.close();
        stmt.close();
        conn.close();
        return v;
    }
    
    @Override
    public List<Valores> selectALL() throws Exception{
        ArrayList<Valores> valores = new ArrayList<>();
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM valores";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            Valores v = new Valores();
            v.setIdValores(result.getInt(1));
            v.setValor(result.getDouble(2));
            v.setDescricao(result.getString(3));
            v.setTempo(result.getInt(4));
            v.setTipo(result.getString(5));
            valores.add(v);
        }
        result.close();
        stmt.close();
        conn.close();
        return valores;
    }
    
    
}