/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AhmedEldeeb
 */
@Repository
public class CommentDAOImpl implements CommentDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addComment(Comment comment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(comment);
    }

    @Override
    public void DeleteComment(Comment comment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(comment);
    }

    @Override
    public Comment getComment(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.load(Comment.class, id);
    }

}
