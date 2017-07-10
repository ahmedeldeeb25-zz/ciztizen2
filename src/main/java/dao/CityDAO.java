/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.City;

/**
 *
 * @author AhmedEldeeb
 */
public interface CityDAO {
    
    public void addCity(City city);
    public List<City> geCity();
    
}
