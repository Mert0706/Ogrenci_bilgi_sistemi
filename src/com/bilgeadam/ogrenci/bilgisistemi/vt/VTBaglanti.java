package com.bilgeadam.ogrenci.bilgisistemi.vt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VTBaglanti {

    public static Connection BaglantiGetir() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ogrencidb","postgres","postgres");


        return conn;
    }


    public static boolean baglantiKapat(Connection conn){
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
