package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DAOVeiculo implements DAO{
    private ConnectionFactory conn;
    
    public DAOVeiculo(){
        this.conn = new ConnectionFactory();
    }
    
    @Override
    public Object save(Object o) throws Exception{
        Veiculo v = (Veiculo) o;
        String sql = "INSERT INTO veiculo(fkcliente, modelo, marca, cor, placa) values (?, ?, ?, ?, ?)";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, v.getIdCliente());
        stmt.setString(2, v.getModelo());
        stmt.setString(3, v.getMarca());
        stmt.setString(4, v.getCor());
        stmt.setString(5, v.getPlaca());
        stmt.execute();
        stmt.close();
        return null;
    }
    
    @Override
    public void update(Object o) throws Exception{
        Veiculo v = (Veiculo) o;
        String sql = "UPDATE veiculo SET idCliente = ?, modelo = ?, marca = ?, cor = ?, placa = ? WHERE idVeiculo = ?";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, v.getIdCliente());
        stmt.setString(2, v.getModelo());
        stmt.setString(3, v.getMarca());
        stmt.setString(4, v.getCor());
        stmt.setString(5, v.getPlaca());
        stmt.setInt(6, v.getIdVeiculo());
        stmt.execute();
        stmt.close();
        conn.close();
    }
    
    @Override
    public void delete(int id) throws Exception{
        String sql = "DELETE FROM veiculo WHERE idVeiculo = ?";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }
    
    @Override
    public Object findById(int id) throws Exception{
        Veiculo v = null;
        String sql = "SELECT * FROM veiculo WHERE idVeiculo = ?";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            v = new Veiculo();
            v.setIdVeiculo(result.getInt(1));
            v.setIdCliente(result.getInt(2));
            v.setModelo(result.getString(3));
            v.setMarca(result.getString(4));
            v.setCor(result.getString(5));
            v.setPlaca(result.getString(6));
        }
        result.close();
        stmt.close();
        conn.close();
        return v;
    }
    
    @Override
    public List<Veiculo> selectALL() throws Exception{
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculo";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            Veiculo v = new Veiculo();
            v.setIdVeiculo(result.getInt(1));
            v.setIdCliente(result.getInt(2));
            v.setModelo(result.getString(3));
            v.setMarca(result.getString(4));
            v.setCor(result.getString(5));
            v.setPlaca(result.getString(6));
            veiculos.add(v);
        }
        result.close();
        stmt.close();
        conn.close();
        return veiculos;
    }
    
    public List<Veiculo> selectVeiculsOfClient(Cliente cliente) throws Exception{
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculo where fkCliente = ?";
        Connection c = conn.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cliente.getIdCliente());
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            Veiculo v = new Veiculo();
            v.setIdVeiculo(result.getInt(1));
            v.setIdCliente(result.getInt(2));
            v.setModelo(result.getString(3));
            v.setMarca(result.getString(4));
            v.setCor(result.getString(5));
            v.setPlaca(result.getString(6));
            veiculos.add(v);
        }
        result.close();
        stmt.close();
        conn.close();
        return veiculos;
    }
}