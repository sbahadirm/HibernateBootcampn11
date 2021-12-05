package dao;

import base.BaseDao;
import entity.Urun;
import org.hibernate.query.Query;

import java.util.List;

public class UrunDao extends BaseDao {

    public List<Urun> findAll(){

        Query query = getCurrentSession().createQuery("select urun from Urun urun");

        return query.list();
    }
}
