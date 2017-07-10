/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import service.PersonService;

/**
 *
 * @author AhmedEldeeb
 */
public class test {

   private PersonService personService;

    @Autowired(required = true)
    @Qualifier(value = "personService")
    public void setPersonService(PersonService ps) {
        this.personService = ps;
    }
    
    public int listPersons() {
       
         return this.personService.listPersons().size();
       
    }


    public static void main(String[] args) {

        try {
            System.out.println("Welcome Ahmed");

            test t = new test();
            System.out.println(t.listPersons());
            
            System.out.println("Finish your work Ahmed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
