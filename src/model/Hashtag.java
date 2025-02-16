package model;

import java.util.ArrayList;
import java.util.List;

public class Hashtag {
    private final String tag;
    private final List<Post> taggedPosts;
    private final List<Observer> observers;

    public Hashtag(String tag) {
        this.tag = tag;
        this.taggedPosts = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addPost(Post post) {
        taggedPosts.add(post);
        notifyObservers(post);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Post post) {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }

    public List<Post> getTaggedPosts() { return taggedPosts; }
    public String getTag() { return tag; }
}
