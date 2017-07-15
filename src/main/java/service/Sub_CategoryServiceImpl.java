/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.Sub_categoryDAO;
import model.Sub_category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class Sub_CategoryServiceImpl implements Sub_CategoryService{

    private Sub_categoryDAO Sub_categoryDAO;
    
    public void setSubCategoryDAO(Sub_categoryDAO Sub_categoryDAO){
        this.Sub_categoryDAO=Sub_categoryDAO;
    }
    @Override
    @Transactional
    public Sub_category getSubById(int id) {
        return Sub_categoryDAO.getSubById(id);
    }
     
}
