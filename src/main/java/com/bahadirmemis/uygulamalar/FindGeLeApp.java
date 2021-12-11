package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.entity.Urun;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.List;

public class FindGeLeApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        List<Urun> urunList = service.findAllUrunListByFiyatGeAndFiyatLe(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
