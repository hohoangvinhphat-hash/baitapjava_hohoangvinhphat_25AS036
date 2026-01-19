package baitap71;
import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Visit v1 = new Visit("An", new Date());
        v1.setServiceExpense(100.0);
        v1.setProductExpense(100.0);

        // Trường hợp 1: Khách hàng Premium
        v1.setCustomerMember(true, "Premium");
        System.out.println(v1.getName() + " (Premium) Total: " + v1.getTotalExpense());
        // Dịch vụ giảm 20%, Sản phẩm giảm 10% -> 80 + 90 = 170

        // Trường hợp 2: Khách hàng không có thẻ thành viên
        Visit v2 = new Visit("Bình", new Date());
        v2.setServiceExpense(100.0);
        v2.setProductExpense(100.0);
        System.out.println(v2.getName() + " (No Member) Total: " + v2.getTotalExpense());
        // Không giảm giá -> 100 + 100 = 200
    }
}
