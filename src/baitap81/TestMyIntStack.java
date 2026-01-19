package baitap81;

public class TestMyIntStack {
    public static void main(String[] args) {
        // Khởi tạo stack với sức chứa nhỏ (2) để kiểm tra tính năng mở rộng
        MyIntStack stack = new MyIntStack(2);

        System.out.println("Push 10: " + stack.push(10));
        System.out.println("Push 20: " + stack.push(20));

        // Lần push này sẽ kích hoạt hàm expandCapacity()
        System.out.println("Push 30: " + stack.push(30));

        System.out.println("Peek: " + stack.peek()); // Kết quả: 30
        System.out.println("Pop: " + stack.pop());   // Kết quả: 30
        System.out.println("Pop: " + stack.pop());   // Kết quả: 20
    }
}
