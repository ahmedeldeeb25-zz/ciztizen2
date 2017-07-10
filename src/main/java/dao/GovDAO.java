/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Govern;

/**
 *
 * @author AhmedEldeeb
 */
public interface GovDAO {
    
    public List<GovDAOImpl> GovList();
    public void addGov(Govern g);
}
