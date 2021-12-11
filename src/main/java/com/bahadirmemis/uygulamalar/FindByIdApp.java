package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.entity.Urun;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

public class FindByIdApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        Urun urun = service.findById(1L);

        System.out.println(urun);
    }
}
