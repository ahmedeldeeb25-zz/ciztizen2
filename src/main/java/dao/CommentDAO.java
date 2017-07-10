/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Comment;

/**
 *
 * @author AhmedEldeeb
 */
public interface CommentDAO {
    
    public void addComment(Comment comment);
    public void updateComment(Comment comment);
    public void DeleteComment(Comment comment);
    public Comment getComment(int id);
    
}
