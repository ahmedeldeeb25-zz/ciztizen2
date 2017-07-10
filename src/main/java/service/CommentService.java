/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Comment;

/**
 *
 * @author AhmedEldeeb
 */
public interface CommentService {

    public void addComment(Comment comment);

    public void updateComment(Comment comment);

    public void DeleteComment(Comment comment);

    public Comment getComment(int id);
}
