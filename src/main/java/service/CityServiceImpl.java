/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CityDAO;
import java.util.List;
import model.City;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class CityServiceImpl implements CityService{

    private CityDAO cityDAO;
    
    public void setCityDAO(CityDAO cityDAO){
        this.cityDAO=cityDAO;
    
    }
    
    @Override
    @Transactional
    public void addCity(City city) {
        this.cityDAO.addCity(city);
    }

    @Override
    @Transactional
    public List<City> geCity() {
       return  this.cityDAO.geCity();
    }
    
}
