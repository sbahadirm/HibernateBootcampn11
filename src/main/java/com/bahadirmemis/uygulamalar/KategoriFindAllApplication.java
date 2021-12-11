package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.entity.Kategori;
import com.bahadirmemis.entityservice.KategoriEntityService;

import java.util.List;

public class KategoriFindAllApplication {

    public static void main(String[] args) {

        KategoriEntityService service = new KategoriEntityService();
        List<Kategori> kategoriList = service.findAll();

        for (Kategori kategori : kategoriList) {
            System.out.println(kategori.getAdi());
        }
    }
}
