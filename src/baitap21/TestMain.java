package baitap21;

public class TestMain {
    public static void main(String[] args) {
        // Bước 1: Tạo tác giả trước (Author)
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println("Tác giả: " + author1);

        // Bước 2: Tạo sách (Book) sử dụng tác giả vừa tạo
        // Sử dụng Constructor 1 (không có qty)
        Book dummyBook = new Book("Java for dummies", author1, 19.95);
        System.out.println(dummyBook);
        // Kết quả mong đợi: Book[name=Java for dummies, author=Author[name=Tan Ah Teck...], price=19.95, qty=0]

        // Bước 3: Thử thay đổi giá và số lượng
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Sách sau khi cập nhật: " + dummyBook);

        // Bước 4: Sử dụng Constructor 2 (có qty)
        Book moreEffectiveJava = new Book("More Effective Java", author1, 29.95, 88);
        System.out.println(moreEffectiveJava);
    }
}
