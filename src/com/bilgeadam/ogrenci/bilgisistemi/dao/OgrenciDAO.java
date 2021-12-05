package com.bilgeadam.ogrenci.bilgisistemi.dao;

import com.bilgeadam.ogrenci.bilgisistemi.dto.Ogrenci;
import com.bilgeadam.ogrenci.bilgisistemi.vt.VTBaglanti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OgrenciDAO {
    public static boolean ekle(Ogrenci ogr) throws SQLException, ClassNotFoundException {

        Connection conn = VTBaglanti.BaglantiGetir();

        String sorgu = "insert into ogrenci(ad,soyad,kredi) values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sorgu);

        ps.setString(1, ogr.getAd());
        ps.setString(2, ogr.getSoyad());
        ps.setDouble(3, ogr.getKredi());

        int sonuc = ps.executeUpdate();

        VTBaglanti.baglantiKapat(conn);

        if (sonuc > 0)
            return true;
        else
            return false;

    }


}
