public class Main {
    public static void main(String[] args) {
        BlogPost post1 = new BlogPost();
        post1.authorName = "John Doe";
        post1.title = "Lorem Ipsum";
        post1.text = "Lorem ipsum dolor sit amet.";
        post1.publicationDate = "2000.05.04.";

        System.out.println(post1.title + " titled by  " + post1.authorName + " at " + post1.publicationDate +  "\n" + post1.text + "\n");

        BlogPost post2 = new BlogPost();
        post2.authorName = "Tim Urban";
        post2.title = "Wait but why";
        post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post2.publicationDate = "2010.10.10.";

        System.out.println(post2.title + " titled by  " + post2.authorName + " at " + post2.publicationDate +  "\n" + post2.text + "\n");


        BlogPost post3 = new BlogPost();
        post3.authorName = "William Turton";
        post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        post3.publicationDate = "2017.03.28.";

        System.out.println(post3.title + " titled by  " + post3.authorName + " at " + post3.publicationDate +  "\n" + post3.text + "\n");


    }
}
