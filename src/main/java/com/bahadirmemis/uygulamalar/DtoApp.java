package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.AnnotationBasedApplication;
import com.bahadirmemis.dto.UrunDetayDto;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();

        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        List<UrunDetayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (UrunDetayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}
