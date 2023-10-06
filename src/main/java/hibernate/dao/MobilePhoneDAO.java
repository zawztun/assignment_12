package hibernate.dao;


import com.google.protobuf.Empty;
import hibernate.entity.MobilePhone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MobilePhoneDAO {
    SessionFactory sessionFactory;

    public  void  saveMobile(MobilePhone mp){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(mp);
        session.getTransaction().commit();
        session.close();
    }
    public  void  updateMobile(MobilePhone updateObj){
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        session.update(updateObj);
        t.commit();
        session.close();
    }

    public void deleteMobile(MobilePhone objectToDel){
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        session.delete(objectToDel);
        t.commit();
        session.close();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
