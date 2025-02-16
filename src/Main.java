import model.Hashtag;
import model.Post;
import model.User;
import service.FeedService;
import service.PostService;
import service.UserService;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = UserService.getInstance();
        FeedService feedService = new FeedService();

        User alice = userService.createUser("Alice");
        User bob = userService.createUser("Bob");
        User charlie = userService.createUser("Charlie");

//        alice.followUser(bob);
        alice.followUser(charlie);

        Hashtag javaTag = new Hashtag("#Java");
        alice.followHashtag(javaTag);

        Post post1 = PostService.createPost("picUrl1", "Learning Java!", bob, Collections.singleton(javaTag));
        javaTag.addPost(post1);

        Post post2 = PostService.createPost("picUrl2", "Spring Boot is great!", charlie, Collections.singleton(javaTag));
        javaTag.addPost(post2);

        System.out.println("Alice's Feed:");
        for (Post post : feedService.getFeed(alice)) {
            System.out.println(post.getAuthor().getName() + ": " + post.getName());
        }
    }
}