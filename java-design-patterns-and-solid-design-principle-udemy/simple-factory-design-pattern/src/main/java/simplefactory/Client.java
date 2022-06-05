package simplefactory;

public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);

        Post post2 = PostFactory.createPost("blog");
        System.out.println(post2);
    }

}
