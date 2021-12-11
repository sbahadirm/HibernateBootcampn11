package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.entity.Urun;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        List<Urun> urunList = service.findAll();

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
