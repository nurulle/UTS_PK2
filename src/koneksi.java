
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Choco Calon Presiden RI
 */
public class koneksi {
     public static Connection MySQL(){
        try {
           MysqlDataSource ds = new MysqlDataSource();
           ds.setUser("root");
           ds.setPassword("");
           ds.setServerName("localhost");
           ds.setDatabaseName("perumahan");
           ds.setServerTimezone("Asia/Jakarta");
           ds.setPortNumber(3306);
           Connection c = ds.getConnection();
           return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        
    }
//    public static void main(String[] args) {
//        try {
//            Connection conn = koneksi.MySQL();
//            System.out.println(conn.getCatalog());
//        } catch (SQLException e) {
//        }
//    }
    
}
