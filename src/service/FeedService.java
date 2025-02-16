package service;

import model.Post;
import model.User;

import java.util.List;

public class FeedService {
    public List<Post> getFeed(User user) {
        return user.getFeed();
    }
}
