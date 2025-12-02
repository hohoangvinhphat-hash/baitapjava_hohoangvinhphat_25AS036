package baitaap22;

public class TestMain {
    public static void main(String[] args) {

        Author[] authors = new Author[2];


        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');


        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);



        System.out.println(javaDummy);

        System.out.println("-------------------------");


        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println("name is: " + javaDummy.getName());
        System.out.println("price is: " + javaDummy.getPrice());
        System.out.println("qty is: " + javaDummy.getQty());

        System.out.println("-------------------------");



        System.out.println("Author names: " + javaDummy.getAuthorNames());


        System.out.println("First author's email: " + javaDummy.getAuthors()[0].getEmail());
    }
}
