package com.bahadirmemis.entityservice;

import com.bahadirmemis.dao.KategoriDao;
import com.bahadirmemis.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriEntityService {

    @Autowired
    private KategoriDao kategoriDao;

    public List<Kategori> findAll(){
        return kategoriDao.findAll();
    }
}
