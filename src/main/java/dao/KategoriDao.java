package dao;

import base.BaseDao;
import entity.Kategori;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class KategoriDao extends BaseDao {

    public List<Kategori> findAll(){

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select kategori from Kategori kategori");

        return query.list();
    }
}
