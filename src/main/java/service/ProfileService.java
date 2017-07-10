/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Profile;

/**
 *
 * @author AhmedEldeeb
 */
public interface ProfileService {

    public void addProfile(Profile profile);

    public void updateProfile(Profile profile);

    public Profile getProfileById(int id);

}
