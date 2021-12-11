package com.bahadirmemis.dao;

import com.bahadirmemis.base.BaseDao;
import com.bahadirmemis.dto.UrunDetayDto;
import com.bahadirmemis.entity.Urun;
import org.hibernate.query.Query;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UrunDao extends BaseDao {

    public List<Urun> findAll(){

        String sql = "select urun from Urun urun";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public Urun findById(Long id){

        String sql = "select urun from Urun urun where urun.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Urun) query.uniqueResult();
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null){
            sql = sql + " and urun.fiyat >= :fiyatGe ";
        }

        if (fiyatLe != null){
            sql = sql + " and urun.fiyat <= :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null && fiyatLe != null){
            sql = sql + " and urun.fiyat between :fiyatGe and :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim) {

        String sql = " select urun from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

    public List<UrunDetayDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim) {

        String sql = " select " +
                " new com.bahadirmemis.dto.UrunDetayDto( urun.adi, kategori.adi, urun.fiyat ) " +
                " from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

}
