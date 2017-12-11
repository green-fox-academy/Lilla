public class Main {
    public static void main(String[] args) {
        BlogPost post1 = new BlogPost();
        post1.setAuthorName( "John Doe" );
        post1.setTitle("Lorem Ipsum");
        post1.setText("Lorem ipsum dolor sit amet.");
        post1.setPublicationDate("2000.05.04.");


        BlogPost post2 = new BlogPost();
        post2.setAuthorName("Tim Urban");
        post2.setTitle("Wait but why");
        post2.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
        post2.setPublicationDate("2010.10.10.");


        BlogPost post3 = new BlogPost();
        post3.setAuthorName("William Turton");
        post3.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
        post3.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        post3.setPublicationDate("2017.03.28.");


    }
}
