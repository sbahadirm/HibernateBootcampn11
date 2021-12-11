package com.bahadirmemis.dao;

import com.bahadirmemis.base.BaseDao;
import com.bahadirmemis.entity.Kategori;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KategoriDao extends BaseDao {

    public List<Kategori> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kategori from Kategori kategori");

        return query.list();
    }
}
