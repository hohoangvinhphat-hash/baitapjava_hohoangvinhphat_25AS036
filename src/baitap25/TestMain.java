package baitap25;

public class TestMain {
    public static void main(String[] args) {

        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1);

        Account a1 = new Account(101, c1, 88.88);
        System.out.println(a1);

        a1.deposit(20);
        System.out.println("Sau khi nap 20: " + a1); // balance=$108.88


        a1.withdraw(10);
        System.out.println("Sau khi rut 10: " + a1); // balance=$98.88

        System.out.println("--- Test rut qua so du ---");
        a1.withdraw(500); // Sẽ in ra thông báo lỗi
        System.out.println(a1); // Balance vẫn giữ nguyên
    }
}