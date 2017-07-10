/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CommentDAO;
import model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class CommentServiceImpl implements CommentService{

    private CommentDAO commentDAO;
    
    public void setCommentDAO(CommentDAO commentDAO){
        this.commentDAO=commentDAO;
    }
    @Override
    @Transactional
    public void addComment(Comment comment) {
        this.commentDAO.addComment(comment);
    }

    @Override
    @Transactional
    public void updateComment(Comment comment) {
        this.commentDAO.updateComment(comment);
    }

    @Override
    @Transactional
    public void DeleteComment(Comment comment) {
        this.DeleteComment(comment);
    }

    @Override
    @Transactional
    public Comment getComment(int id) {
       return this.getComment(id);
    }
    
}