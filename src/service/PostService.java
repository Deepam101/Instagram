package service;

import dao.PostDao;
import model.Hashtag;
import model.Post;
import model.User;

import java.util.Set;

public class PostService {
    public static Post createPost(String imgUrl, String name, User author, Set<Hashtag> hastags){
        PostDao postDao = PostDao.getPostDao();
        Post p = postDao.createPost(imgUrl, name, author, hastags);
        author.addtPost(p);
        return p;
    }
}
