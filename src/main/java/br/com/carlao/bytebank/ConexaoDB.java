package br.com.carlao.bytebank;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String... x) {

        try {
            DriverManager.getConnection("jdbc:mysql://localhost/api_mediciner?user=carlao&password=123321");
            System.out.println("Conexcão estabelicida");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
