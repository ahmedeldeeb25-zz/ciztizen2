/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.ProfileService;

/**
 *
 * @author AhmedEldeeb
 */
@RestController
public class profileRest {

    private ProfileService profileService;

    @Autowired(required = true)
    @Qualifier(value = "ProfileService")
    public void setProfileService(ProfileService ps) {
        this.profileService = ps;
    }

    // @ResponseBody // You neddn't to write it in RestController Class
    @RequestMapping(value = "/getUsers/{id}", method = RequestMethod.GET)
    public Profile getUsers(@PathVariable("id") int id) {
        return this.profileService.getProfileById(id);
    }
    
    @RequestMapping(value = "/saveUsers", method = RequestMethod.POST)
    public ResponseEntity<String> saveUsers(@RequestBody Profile profile) {
         this.profileService.addProfile(profile);
         
         return new ResponseEntity<String>("Hello World",HttpStatus.CREATED);
    }
    
}
