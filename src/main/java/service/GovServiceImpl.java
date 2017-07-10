/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.GovDAO;
import dao.GovDAOImpl;
import java.util.List;
import model.Govern;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class GovServiceImpl implements GovService {

    private GovDAO govDAO;

    public void setGovDAO(GovDAO govDAO) {
        this.govDAO=govDAO;
    }

    @Override
    @Transactional
    public List<GovDAOImpl> GovList() {
        return this.govDAO.GovList();
    }

    @Override
    @Transactional
    public void addGov(Govern g) {
        this.govDAO.addGov(g);
    }

}
