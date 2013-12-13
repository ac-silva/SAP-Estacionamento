package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente implements DAO {

    private ConnectionFactory conn;

    public DAOCliente() {
        this.conn = new ConnectionFactory();
    }

    @Override
    public Cliente save(Object o) throws Exception {
        Cliente cliente = (Cliente) o;
        Connection c = conn.getConnection();
        String sql = "INSERT INTO cliente (nome, cpf, endereco, numero, bairro, cidade, uf, celular, telefone, email, dataCadastro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt =  c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getEndereco());
        stmt.setString(4, cliente.getNumero());
        stmt.setString(5, cliente.getBairro());
        stmt.setString(6, cliente.getCidade());
        stmt.setString(7, cliente.getUf());
        stmt.setString(8, cliente.getCelular());
        stmt.setString(9, cliente.getTelefone());
        if(cliente.getEmail() == null){
            stmt.setNull(10, java.sql.Types.VARCHAR);
        }else{
            stmt.setString(10, cliente.getEmail());
        }
        stmt.setDate(11, new java.sql.Date(cliente.getDataCadastro().getTime()));
        stmt.execute();
        ResultSet result = stmt.getGeneratedKeys();
        while(result.next()){
            cliente.setIdCliente(result.getInt(1));
        }
        stmt.close();
        conn.close();
        return cliente;
    }

    @Override
    public void update(Object o) throws Exception {
        Cliente cliente = (Cliente) o;
        Connection c = conn.getConnection();
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, celular = ?, telefone = ?, email = ? WHERE idCliente = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getEndereco());
        stmt.setString(4, cliente.getNumero());
        stmt.setString(5, cliente.getBairro());
        stmt.setString(6, cliente.getCidade());
        stmt.setString(7, cliente.getUf());
        stmt.setString(8, cliente.getCelular());
        stmt.setString(9, cliente.getTelefone());
        stmt.setString(10, cliente.getEmail());
        stmt.setInt(11, cliente.getIdCliente());
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public void delete(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "DELETE FROM cliente where idCliente = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public Cliente findById(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM cliente where idCliente = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        Cliente cliente = null;
        while(result.next()){
            cliente = new Cliente();
            cliente.setIdCliente(result.getInt(1));
            cliente.setNome(result.getString(2));
            cliente.setCpf(result.getString(3));
            cliente.setEndereco(result.getString(4));
            cliente.setNumero(result.getString(5));
            cliente.setBairro(result.getString(6));
            cliente.setCidade(result.getString(7));
            cliente.setUf(result.getString(8));
            cliente.setCelular(result.getString(9));
            cliente.setTelefone(result.getString(10));
            cliente.setEmail(result.getString(11));
            cliente.setDataCadastro(new java.util.Date(result.getDate(12).getTime()));
        }
        result.close();
        stmt.close();
        conn.close();
        return cliente;
    }

    @Override
    public List<Cliente> selectALL() throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM cliente";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Cliente> clientes = new ArrayList<>();
        while(result.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(result.getInt(1));
            cliente.setNome(result.getString(2));
            cliente.setCpf(result.getString(3));
            cliente.setEndereco(result.getString(4));
            cliente.setNumero(result.getString(5));
            cliente.setBairro(result.getString(6));
            cliente.setCidade(result.getString(7));
            cliente.setUf(result.getString(8));
            cliente.setCelular(result.getString(9));
            cliente.setTelefone(result.getString(10));
            cliente.setEmail(result.getString(11));
            cliente.setDataCadastro(new java.util.Date(result.getDate(12).getTime()));
            clientes.add(cliente);
        }
        result.close();
        stmt.close();
        conn.close();
        return clientes;
    }
    
    public List<Cliente> selectForCpf(String cpf) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM cliente where cpf like ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, "%"+cpf+"%");
        ResultSet result = stmt.executeQuery();
        ArrayList<Cliente> clientes = new ArrayList<>();
        while(result.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(result.getInt(1));
            cliente.setNome(result.getString(2));
            cliente.setCpf(result.getString(3));
            cliente.setEndereco(result.getString(4));
            cliente.setNumero(result.getString(5));
            cliente.setBairro(result.getString(6));
            cliente.setCidade(result.getString(7));
            cliente.setUf(result.getString(8));
            cliente.setCelular(result.getString(9));
            cliente.setTelefone(result.getString(10));
            cliente.setEmail(result.getString(11));
            cliente.setDataCadastro(new java.util.Date(result.getDate(12).getTime()));
            clientes.add(cliente);
        }
        result.close();
        stmt.close();
        conn.close();
        return clientes;
    }
    
    public Cliente findClienteByVeiculo(String placa) throws Exception{
        Connection c = conn.getConnection();
        String sql = "SELECT c.* FROM veiculo v inner join  cliente c on c.idcliente = v.fkcliente where v.placa = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, placa);
        ResultSet result = stmt.executeQuery();
        Cliente cliente = null;
        while(result.next()){
            cliente = new Cliente();
            cliente.setIdCliente(result.getInt(1));
            cliente.setNome(result.getString(2));
            cliente.setCpf(result.getString(3));
            cliente.setEndereco(result.getString(4));
            cliente.setNumero(result.getString(5));
            cliente.setBairro(result.getString(6));
            cliente.setCidade(result.getString(7));
            cliente.setUf(result.getString(8));
            cliente.setCelular(result.getString(9));
            cliente.setTelefone(result.getString(10));
            cliente.setEmail(result.getString(11));
            cliente.setDataCadastro(new java.util.Date(result.getDate(12).getTime()));
        }
        result.close();
        stmt.close();
        conn.close();
        return cliente;
    }

}
