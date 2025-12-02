package baitap23;

public class TestMain {
    public static void main(String[] args) {

        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(ahTeck);



        Book dummyBook = new Book("978-3-16-148410-0", "Java for Dummies", ahTeck, 19.95, 99);


        System.out.println(dummyBook);



        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("New name is: " + dummyBook.getName());
        System.out.println("New price is: " + dummyBook.getPrice());
        System.out.println("New qty is: " + dummyBook.getQty());


        System.out.println("Author is: " + dummyBook.getAuthorName());
    }
}