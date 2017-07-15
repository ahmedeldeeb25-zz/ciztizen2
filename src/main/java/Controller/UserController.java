/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.Valid;
import model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;
import service.ProfileService;

/**
 *
 * @author AhmedEldeeb
 */
@Controller
public class UserController {

    private ProfileService profileService;

    @Autowired(required = true)
    @Qualifier(value = "ProfileService")
    public void setProfileService(ProfileService ps) {
        this.profileService = ps;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String EnterRequestration() {
        return "register";

    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addProfile(@Valid @ModelAttribute("profile") Profile profile, BindingResult bindResult) {

        if (bindResult.hasErrors()) {
            return EnterRequestration();
        }
        this.profileService.addProfile(profile);
        return "signin";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView signin() {
        return new ModelAndView("signin");

    }

//    @ResponseBody // To get these data in RESTFUL API just in @ControllerClass
//    @RequestMapping(value = "/getUsers/{id}", method = RequestMethod.GET)
//    public Profile getUsers(@PathVariable("id") int id) {
//        return profileService.getProfileById(id);
//
//    }
}
