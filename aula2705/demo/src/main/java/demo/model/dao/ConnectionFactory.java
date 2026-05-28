package demo.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static Connection con = null;

    public static Connection getConnection(){
        String datbase = "sistema";
        String host = "localhost";
        String user = "root";
        String pass = "1234";
        String url = "jdbc:mysql://"+host+"/"+datbase;
        if(con != null){
            return con;
        }else{
            try{
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Banco de dados conectado!");
                return con;
            }catch(Exception e){
                System.out.println("Erro ao conectar no banco "+ datbase);
                return null;
            }
        }
    }
}
