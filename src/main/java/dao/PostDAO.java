/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import model.Post;

/**
 *
 * @author AhmedEldeeb
 */
public interface PostDAO {

    public void addPost(Post post);

    public void updatePost(Post post);

    public void deletePost(Post post);

    public List<Post> listPosts();

    public List<Post> listPostsByCategory(int id);

    public Post getPostById(int id);
}
