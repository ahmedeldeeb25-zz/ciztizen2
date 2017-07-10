/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AhmedEldeeb
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addCategory(Category cat) {
        Session session=this.sessionFactory.getCurrentSession();
        session.persist(cat);
    }

    @Override
    public List<Category> ListCategory() {
       Session session=this.sessionFactory.getCurrentSession();
       return session.createQuery("from Category").list();
    }

    @Override
    public Category getCategory(int id) {
       Session session=this.sessionFactory.getCurrentSession();
       return session.get(Category.class, id);
    }

}
