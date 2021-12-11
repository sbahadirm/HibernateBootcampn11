package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.entity.Kategori;
import com.bahadirmemis.entityservice.KategoriEntityService;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class KategoriFindAllApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        KategoriEntityService service = applicationContext.getBean(KategoriEntityService.class);

        List<Kategori> kategoriList = service.findAll();

        for (Kategori kategori : kategoriList) {
            System.out.println(kategori.getAdi());
        }
    }
}
