package demo;

import java.sql.Connection;
import java.sql.SQLException;

import demo.model.dao.ConnectionFactory;

public class Main {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionFactory.getConnection();
            con.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}