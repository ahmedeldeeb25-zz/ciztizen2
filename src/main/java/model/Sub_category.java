/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
import javax.persistence.OneToMany;
 

/**
 *
 * @author Ahmed_Eldeeb
 */
@Entity
public class Sub_category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category cat_id;

    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    private Collection<Post> posts = new ArrayList<Post>();

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCat_id() {
        return cat_id;
    }

    public void setCat_id(Category cat_id) {
        this.cat_id = cat_id;
    }

}
