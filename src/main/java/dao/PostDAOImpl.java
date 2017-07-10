/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AhmedEldeeb
 */
@Repository
public class PostDAOImpl implements PostDAO {

     

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addPost(Post post) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(post);
        

    }

    @Override
    public void updatePost(Post post) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(post);
        
    }

    @Override
    public void deletePost(Post post) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(post);
         
    }

    @Override
    public List<Post> listPosts() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Post> post = session.createQuery("from Post").list();

        return post;
    }

    @Override
    public Post getPostById(int id) {
        return new Post();
    }

    @Override
    public List<Post> listPostsByCategory(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Post> post = session.createCriteria("from Post where Categeory="+id).list();
        return post;
    }

}
