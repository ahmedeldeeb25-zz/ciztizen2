/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AhmedEldeeb
 */
@Repository
public class CityDAOImpl implements CityDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    
    @Override
    public void addCity(City city) {
       Session session=this.sessionFactory.getCurrentSession();
       session.persist(city);
    }

    @Override
    public List<City> geCity() {
        Session session=this.sessionFactory.getCurrentSession();
        return session.createQuery("from city").list();
    }
    
}
