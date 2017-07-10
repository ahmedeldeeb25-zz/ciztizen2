/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Govern;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AhmedEldeeb
 */
@Repository
public class GovDAOImpl implements GovDAO{

     private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    
    @Override
    public List<GovDAOImpl> GovList() {
        Session session=this.sessionFactory.getCurrentSession();
        return session.createQuery("from govern").list();
    }

    @Override
    public void addGov(Govern g) {
        Session session=this.sessionFactory.getCurrentSession();
         session.persist(g);
    }
    
}
