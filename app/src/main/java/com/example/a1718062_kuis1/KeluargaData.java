package com.example.a1718062_kuis1;

import java.util.ArrayList;

public class KeluargaData {
    private static String[] keluargaNama = {
            "Putu Adi Sudarmawan",
            "Ketut Suci Wati",
            "Putu Adi Sudarmawan",
            "Ika ari artawan"
    };

    private static String[] keluargaKeterangan = {
            "Ayah",
            "Ibu",
            "Anak Pertama",
            "Anak Kedua",
    };

    private static int[] heroesImages = {
            R.drawable.ayah,
            R.drawable.ibu,
            R.drawable.aku,
            R.drawable.adek
    };

    static ArrayList<Keluarga> getListData() {
        ArrayList<Keluarga> list = new ArrayList<>();
        for (int pos = 0; pos < keluargaNama.length; pos++){
            Keluarga keluarga = new Keluarga();
            keluarga.setNama(keluargaNama[pos]);
            keluarga.setKeterangan(keluargaKeterangan[pos]);
            keluarga.setFoto(heroesImages[pos]);
            list.add(keluarga);
        }
        return list;
    }
}
