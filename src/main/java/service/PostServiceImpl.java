/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PostDAO;
import java.util.List;
import model.Post;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class PostServiceImpl implements PostService {

    private PostDAO postDAO;

    public void setPostDAO(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    @Override
    @Transactional
    public void addPost(Post post) {
       this.postDAO.addPost(post);
    }

    @Override
    @Transactional
    public void updatePost(Post post) {
        this.postDAO.updatePost(post);
    }

    @Override
    @Transactional
    public void deletePost(Post post) {
        this.postDAO.deletePost(post);
    }

    @Override
    @Transactional
    public List<Post> listPosts() {
        return this.postDAO.listPosts();
    }

    @Override
    @Transactional
    public Post getPostById(int id) {
       return  this.postDAO.getPostById(id);
    }

    @Override
    @Transactional
    public List<Post> listPostsByCategory(int id) {
        return this.postDAO.listPostsByCategory(id);
    }

}
