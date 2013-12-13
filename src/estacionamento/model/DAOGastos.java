package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOGastos implements DAO{
    private ConnectionFactory conn;
    
    public DAOGastos(){
        this.conn = new ConnectionFactory();
    }
    
    @Override
    public Object save(Object o) throws Exception {
        Connection c  = conn.getConnection();
        Gastos g = (Gastos) o;
        String sql = "INSERT INTO gastos (descricao, valor, dataVencimento, dataQuitado) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, g.getDescricao());
        stmt.setDouble(2, g.getValor());
        stmt.setDate(3, new java.sql.Date(g.getDataVencimento().getTime()));
        Object dataQuitado = null;
        if(g.getDataQuitado() != null){
             dataQuitado = new java.sql.Date(g.getDataQuitado().getTime());
        }
        stmt.setObject(4, dataQuitado); 
        stmt.execute();
        stmt.close();
        conn.close();
        return null;
    }

    @Override
    public void update(Object o) throws Exception {
        Connection c = conn.getConnection();
        Gastos g = (Gastos) o;
        String sql = "UPDATE gastos SET descricao = ?, valor =  ?, dataVencimento = ?, dataQuitado = ? WHERE idGastos = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, g.getDescricao());
        stmt.setDouble(2, g.getValor());
        stmt.setDate(3, new java.sql.Date(g.getDataVencimento().getTime()));
        Object dataQuitado = null;
        if(g.getDataQuitado() != null){
             dataQuitado = new java.sql.Date(g.getDataQuitado().getTime());
        }
        stmt.setObject(4, dataQuitado); 
        stmt.setInt(5, g.getIdGasto());
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public void delete(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "DELETE FROM gastos where idGasto = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public Object findById(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM gastos where idGasto = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        Gastos g = null;
        while(result.next()){
            g = new Gastos();
            g.setIdGasto(result.getInt(1));
            g.setValor(result.getDouble(2));
            g.setDataVencimento(new java.util.Date(result.getDate(3).getTime()));
            if(result.getDate(4) != null){
                g.setDataQuitado(new java.util.Date(result.getDate(4).getTime()));
            }
        }
        result.close();
        stmt.close();
        conn.close();
        return g;
    }

    @Override
    public List<Gastos> selectALL() throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM gastos";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Gastos> gastos = new ArrayList<>();
        while(result.next()){
            Gastos g = new Gastos();
            g.setIdGasto(result.getInt(1));
            g.setDescricao(result.getString(2));
            g.setValor(result.getDouble(3));
            g.setDataVencimento(new java.util.Date(result.getDate(4).getTime()));
            if(result.getDate(5) !=  null){
                g.setDataQuitado(new java.util.Date(result.getDate(5).getTime()));
            }
            gastos.add(g);
        }
        result.close();
        stmt.close();
        conn.close();
        return gastos;
    }
    
    public List<Gastos> selectALLQuitados() throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM gastos where dataQuitado is not null";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Gastos> gastos = new ArrayList<>();
        while(result.next()){
            Gastos g = new Gastos();
            g.setIdGasto(result.getInt(1));
            g.setDescricao(result.getString(2));
            g.setValor(result.getDouble(3));
            g.setDataVencimento(new java.util.Date(result.getDate(4).getTime()));
            if(result.getDate(5) !=  null){
                g.setDataQuitado(new java.util.Date(result.getDate(5).getTime()));
            }
            gastos.add(g);
        }
        result.close();
        stmt.close();
        conn.close();
        return gastos;
    }
    
    public List<Gastos> selectALLQuitadosInInterval(Date inicio, Date fim) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM gastos where dataQuitado is not null AND date(dataQuitado) between ? and ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDate(1, new java.sql.Date(inicio.getTime()));
        stmt.setDate(2, new java.sql.Date(fim.getTime()));
        ResultSet result = stmt.executeQuery();
        ArrayList<Gastos> gastos = new ArrayList<>();
        while(result.next()){
            Gastos g = new Gastos();
            g.setIdGasto(result.getInt(1));
            g.setDescricao(result.getString(2));
            g.setValor(result.getDouble(3));
            g.setDataVencimento(new java.util.Date(result.getDate(4).getTime()));
            if(result.getDate(5) !=  null){
                g.setDataQuitado(new java.util.Date(result.getDate(5).getTime()));
            }
            gastos.add(g);
        }
        result.close();
        stmt.close();
        conn.close();
        return gastos;
    }
    
    public List<Gastos> selectByDescricao(String descricao) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM gastos WHERE descricao like ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, "%" + descricao + "%");
        ResultSet result = stmt.executeQuery();
        ArrayList<Gastos> gastos = new ArrayList<>();
        while(result.next()){
            Gastos g = new Gastos();
            g.setIdGasto(result.getInt(1));
            g.setDescricao(result.getString(2));
            g.setValor(result.getDouble(3));
            g.setDataVencimento(new java.util.Date(result.getDate(4).getTime()));
            if(result.getDate(5) !=  null){
                g.setDataQuitado(new java.util.Date(result.getDate(5).getTime()));
            }
            gastos.add(g);
        }
        result.close();
        stmt.close();
        conn.close();
        return gastos;
    }
}