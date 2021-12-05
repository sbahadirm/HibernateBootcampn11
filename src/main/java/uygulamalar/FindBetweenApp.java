package uygulamalar;

import entity.Urun;
import entityservice.UrunEntityService;

import java.math.BigDecimal;
import java.util.List;

public class FindBetweenApp {

    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<Urun> urunList = service.findAllUrunListByFiyatBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
