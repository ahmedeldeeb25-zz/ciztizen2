/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDAO;
import model.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileDAO profileDAO;

    public void setProfileDAO(ProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    @Override
    @Transactional
    public void addProfile(Profile profile) {
        this.profileDAO.addProfile(profile);
    }

    @Override
    @Transactional
    public void updateProfile(Profile profile) {
        this.profileDAO.updateProfile(profile);
    }

    @Override
    @Transactional
    public Profile getProfileById(int id) {
        return this.profileDAO.getProfileById(id);
    }

    

}
