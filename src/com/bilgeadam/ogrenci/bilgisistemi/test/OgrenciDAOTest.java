package com.bilgeadam.ogrenci.bilgisistemi.test;

import com.bilgeadam.ogrenci.bilgisistemi.dao.OgrenciDAO;
import com.bilgeadam.ogrenci.bilgisistemi.dto.Ogrenci;

import java.sql.SQLException;

public class OgrenciDAOTest {
    public static void main(String[] args) {

        try {
            Ogrenci ogr = new Ogrenci();
            ogr.setAd("Recep");
            ogr.setSoyad("Tayyip");
            ogr.setKredi(0.50);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            if (sonuc)
                System.out.println("Başarıyla Eklendi");
            else
                System.out.println("Ekleme Başarısız Oldu");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
