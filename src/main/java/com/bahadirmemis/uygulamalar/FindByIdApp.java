package com.bahadirmemis.uygulamalar;

import com.bahadirmemis.entity.Urun;
import com.bahadirmemis.entityservice.UrunEntityService;

public class FindByIdApp {

    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        Urun urun = service.findById(1L);

        System.out.println(urun);
    }
}
