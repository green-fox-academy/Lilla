public class Table {
    public static void main(String[] args) {

        PostIt text1 = new PostIt();
        text1.backgroundColor = "orange";
        text1.text = "Idea 1";
        text1.textColor = "blue";
        System.out.println(text1.backgroundColor + text1.text + text1.textColor);

        PostIt text2 = new PostIt();
        text2.backgroundColor = "pink";
        text2.text = "Awsome";
        text2.textColor = "black";
        System.out.println(text2.backgroundColor + text2.text + text2.textColor);

        PostIt text3 = new PostIt();
        text3.backgroundColor = "yellow";
        text3.text = "Superb";
        text3.textColor = "green";
        System.out.println(text3.backgroundColor + text3.text + text3.textColor);
    }
}
