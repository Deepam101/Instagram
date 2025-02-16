package model;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private int id;
    private String name;
    private String imgUrl;
    private Set<Hashtag> hashTags;
    private User author;
    private Set<User> likedUser;

    public Post(int id, String imgUrl, String name, User author, Set<Hashtag> hashTags) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.author = author;
        this.hashTags = hashTags;
        this.likedUser = new HashSet<>();
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Set<Hashtag> getHashTags() {
        return hashTags;
    }

    public void setHashTags(Set<Hashtag> hashTags) {
        this.hashTags = hashTags;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<User> getLikedUser() {
        return likedUser;
    }

    public void setLikedUser(Set<User> likedUser) {
        this.likedUser = likedUser;
    }
}
