package base;

import hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

public class BaseDao {

    protected SessionFactory sessionFactory;

    public BaseDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
}
