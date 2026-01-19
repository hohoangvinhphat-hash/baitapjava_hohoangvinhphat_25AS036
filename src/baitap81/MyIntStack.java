package baitap81;

public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    // Yêu cầu 1: Sửa đổi push() để ném IllegalStateException nếu stack đầy
    // Yêu cầu 2: Sửa đổi push() để trả về true nếu thành công
    public boolean push(int element) {
        if (isFull()) {
            // Lựa chọn 1: Ném ngoại lệ (Yêu cầu 1)
            // throw new IllegalStateException("Stack is full!");

            // Lựa chọn 2: Tự động mở rộng kích thước (Yêu cầu 3)
            expandCapacity();
        }
        contents[++tos] = element;
        return true;
    }

    // Yêu cầu 3: Tăng dung lượng bằng cách cấp phát lại mảng khác nếu stack đầy
    private void expandCapacity() {
        int newCapacity = contents.length * 2; // Gấp đôi kích thước hiện tại
        int[] newContents = new int[newCapacity];
        System.arraycopy(contents, 0, newContents, 0, contents.length);
        contents = newContents;
        System.out.println("Stack expanded to capacity: " + newCapacity);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}