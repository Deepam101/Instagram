package model;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private int id;
    private String name;
    private List<Post> postsList;
    private List<User> followerList;
    private List<Post> feed;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.postsList = new ArrayList<>();
        this.followerList = new ArrayList<>();
        this.feed = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPostsList() {
        return postsList;
    }

    public void addtPost(Post post) {
        this.postsList.add(post);
        notifyObservers(post);
    }

    public List<User> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(List<User> followerList) {
        this.followerList = followerList;
    }

    public List<Post> getFeed() {
        return feed;
    }

    public void setFeed(List<Post> feed) {
        this.feed = feed;
    }

    private void notifyObservers(Post post) {
        for (Observer observer : this.followerList) {
            observer.update(post);
        }
    }

    @Override
    public void update(Post post) {
        this.feed.add(post);
    }

    public void addFollower(User user){
        this.followerList.add(user);
    }
    public void followUser(User user) {
        user.addFollower(this);
    }

    public void followHashtag(Hashtag hashtag) {
        hashtag.addObserver(this);
    }
}
