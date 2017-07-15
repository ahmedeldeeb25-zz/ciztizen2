/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
 
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.*;

/**
 *
 * @author Ahmed_Eldeeb
 */
@Entity
@Table(name="Profile")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","posts","Picture","comments"})

public class Profile implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3,max = 20)
    @JsonProperty("FirstName") // Change it's name in JSON
    private String First_name;
    @NotNull
    private String Last_name;
    
    private String Address;
    @Column(unique = true)
    private String Email;
    private String Password;
    private String Phone;
    private String About;
    private String Social;
    private String sec_question;
    private String answer;
    //@Column(name = "name", insertable = true, updatable = true, nullable = false, length = 255)
    @Lob
    @Column(columnDefinition = "LONGBLOB default NULL")
    private byte[] Picture;

    ///Realtions
    @OneToMany(mappedBy = "user_id",fetch = FetchType.EAGER)
    private Collection<Post> posts = new ArrayList<Post>();

     
    @OneToMany(mappedBy = "user_id")
    private Collection<Comment> comments = new ArrayList<Comment>();

    
     public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }
    

    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }

    public String getSec_question() {
        return sec_question;
    }

    public void setSec_question(String sec_question) {
        this.sec_question = sec_question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public String getSocial() {
        return Social;
    }

    public void setSocial(String Social) {
        this.Social = Social;
    }

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] Picture) {
        this.Picture = Picture;
    }

}
