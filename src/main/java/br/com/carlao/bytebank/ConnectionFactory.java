package br.com.carlao.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection conex(){
        try {
           return DriverManager.getConnection("jdbc:mysql://localhost/byte_bank?user=carlao&password=123321");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
