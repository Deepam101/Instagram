package dao;

import model.Hashtag;
import model.Post;
import model.User;

import java.util.*;

public class PostDao {
    private int postId=1;
    private static PostDao postDao;
    private final Map<Integer, Post> postMap = new HashMap<>();

    private PostDao() {}

    public static synchronized PostDao getPostDao(){
        if(postDao == null)
            postDao = new PostDao();
        return postDao;
    }

    public Post createPost(String imgUrl, String name, User author, Set<Hashtag> hastags){
        Post post = new Post(postId, imgUrl, name, author, hastags);
        postMap.put(postId++, post);
        return post;
    }
}
