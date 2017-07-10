/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Person;
import model.Profile;
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
public class ProfileDAOImpl implements ProfileDAO {

    private static final Logger logger = LoggerFactory.getLogger(ProfileDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addProfile(Profile profile) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(profile);
        logger.info("New Profile saved successfully, Person Details=" + profile);
    }

    @Override
    public void updateProfile(Profile profile) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(profile);
        logger.info("Profile updated successfully, Person Details=" + profile);
    }

    @Override
    public Profile getProfileById(int id) {
        Session session = this.sessionFactory.getCurrentSession();		
		Profile p = (Profile) session.load(Profile.class, new Integer(id));
		logger.info("Profile loaded successfully, Profile details="+p);
		return p;
    }

}
