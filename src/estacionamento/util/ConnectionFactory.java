package estacionamento.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private Connection conn = null;
    private String host = "localhost";
    private String db = "estacionamento";
    private String user = "root";
    private String pass = "";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);
        return conn;
    }
    
    public void close(){
        this.conn = null;
    }
}
