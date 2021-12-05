package uygulamalar;

import dto.UrunDetayDto;
import entity.Urun;
import entityservice.UrunEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<UrunDetayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (UrunDetayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}
