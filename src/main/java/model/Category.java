/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Ahmed_Eldeeb
 */
@Entity
public class Category {

    //@Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "cat_id")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Collection<Sub_category> sub = new ArrayList<Sub_category>();

    public int getId() {
        return id;
    }

    public Collection<Sub_category> getSub() {
        return sub;
    }

    public void setSub(Collection<Sub_category> sub) {
        this.sub = sub;
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

}
