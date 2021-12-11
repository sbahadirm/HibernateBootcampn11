package com.bahadirmemis.entityservice;

import com.bahadirmemis.dao.KategoriDao;
import com.bahadirmemis.entity.Kategori;

import java.util.List;

public class KategoriEntityService {

    private KategoriDao kategoriDao;

    public KategoriEntityService() {
        kategoriDao = new KategoriDao();
    }

    public List<Kategori> findAll(){
        return kategoriDao.findAll();
    }
}
