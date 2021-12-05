package uygulamalar;

import entity.Urun;
import entityservice.UrunEntityService;

import java.util.List;

public class JoinApp {

    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<Urun> urunList = service.findAllUrunByKategoriKirilim(3L);

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
