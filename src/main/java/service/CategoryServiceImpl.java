/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CategoryDAO;
import java.util.List;
import model.Category;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    private CategoryDAO categoryDAO;

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

    @Override
    @Transactional
    public void addCategory(Category cat) {
        this.categoryDAO.addCategory(cat);
    }

    @Override
    @Transactional
    public List<Category> ListCategory() {
        return this.categoryDAO.ListCategory();
    }

    @Override
    @Transactional
    public Category getCategory(int id) {
        return this.categoryDAO.getCategory(id);
    }
    
}
