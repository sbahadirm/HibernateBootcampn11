package dao;

import entity.Urun;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UrunDao {

    private SessionFactory sessionFactory;

    public UrunDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Urun> findAll(){

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select urun from Urun urun");

        return query.list();
    }
}
