package estacionamento.model;

import estacionamento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class DAOFluxo implements DAO{
    private ConnectionFactory conn;
    private final SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");  
    
    public DAOFluxo(){
        this.conn = new ConnectionFactory();
    }
    
    @Override
    public Object save(Object o) throws Exception {
        Connection c  = conn.getConnection();
        Fluxo f = (Fluxo) o;
        String sql = "INSERT INTO fluxo (dataEntrada, horaEntrada, dataSaida, horaSaida, placa) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDate(1, new java.sql.Date(f.getDataEntrada().getTime()));
        stmt.setTime(2, new java.sql.Time(f.getDataEntrada().getTime()));
        java.sql.Date data = null;
        java.sql.Time hora = null;
        if(f.getDataSaida() != null){
            data = new java.sql.Date(f.getDataSaida().getTime());
            hora = new java.sql.Time(f.getDataSaida().getTime());
        }
        stmt.setObject(3, data);
        stmt.setObject(4, hora);
        stmt.setString(5, f.getPlaca());
        stmt.execute();
        stmt.close();
        conn.close();
        return null;
    }

    @Override
    public void update(Object o) throws Exception {
        Connection c = conn.getConnection();
        Fluxo f = (Fluxo) o;
        String sql = "UPDATE fluxo SET dataEntrada = ?, horaEntrada = ?, dataSaida = ?, horaSaida = ?, placa = ? WHERE idFluxo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setDate(1, new java.sql.Date(f.getDataEntrada().getTime()));
        stmt.setTime(2, new java.sql.Time(f.getDataEntrada().getTime()));
        java.sql.Date data = null;
        java.sql.Time hora = null;
        if(f.getDataSaida() != null){
            data = new java.sql.Date(f.getDataSaida().getTime());
            hora = new java.sql.Time(f.getDataSaida().getTime());
        }
        stmt.setObject(3, data);
        stmt.setObject(4, hora);
        stmt.setString(5, f.getPlaca());
        stmt.setInt(6, f.getIdFluxo());
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public void delete(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "DELETE FROM fluxo where idFluxo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        conn.close();
    }

    @Override
    public Object findById(int id) throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM fluxo where idFluxo = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        Fluxo f = null;
        while(result.next()){
            f = new Fluxo();
            f.setIdFluxo(result.getInt(1));
            String d = result.getDate(2).toString();
            d += " " + result.getTime(3).toString();
            f.setDataEntrada(format.parse(d));
            
            if(result.getDate(4) != null){
                String ds = result.getDate(4).toString();
                ds += " " + result.getTime(5).toString();
                f.setDataSaida(format.parse(ds));
            }
           f.setPlaca(result.getString(6));
        }
        result.close();
        stmt.close();
        conn.close();
        return f;
    }

    @Override
    public List<Fluxo> selectALL() throws Exception {
        Connection c = conn.getConnection();
        String sql = "SELECT * FROM fluxo";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Fluxo> fluxos = new ArrayList<>();
        while(result.next()){
            Fluxo f = new Fluxo();
            f.setIdFluxo(result.getInt(1));
            String d = result.getDate(2).toString();
            d += " " + result.getTime(3).toString();
            f.setDataEntrada(format.parse(d));
            
            if(result.getDate(4) != null){
                String ds = result.getDate(4).toString();
                ds += " " + result.getTime(5).toString();
                f.setDataSaida(format.parse(ds));
            }
            f.setPlaca(result.getString(6));
            fluxos.add(f);
        }
        result.close();
        stmt.close();
        conn.close();
        return fluxos;
    }
    
    public List<Fluxo> selectFluxosAtivos() throws Exception {
        Connection c = conn.getConnection();
        String sql = "select * from fluxo where dataSaida is null ORDER BY horaEntrada DESC;";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        ArrayList<Fluxo> fluxos = new ArrayList<>();
        while(result.next()){
            Fluxo f = new Fluxo();
            f.setIdFluxo(result.getInt(1));
            String d = result.getDate(2).toString();
            d += " " + result.getTime(3).toString();
            f.setDataEntrada(format.parse(d));
            f.setPlaca(result.getString(6));
            fluxos.add(f);
        }
        result.close();
        stmt.close();
        conn.close();
        return fluxos;
    }
    
}
