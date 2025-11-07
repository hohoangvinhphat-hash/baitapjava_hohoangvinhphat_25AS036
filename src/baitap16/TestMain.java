package baitap16;
public class TestMain {
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        Account a2 = new Account("A102", "Kumar", 0);

        System.out.println(a1);
        System.out.println(a2);

        a1.credit(100);
        a1.debit(50);
        a1.debit(500);       // vượt quá số dư
        a1.transferTo(a2, 100);

        System.out.println(a1);
        System.out.println(a2);
    }
}

