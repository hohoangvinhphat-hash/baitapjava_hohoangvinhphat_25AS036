package baitap33;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {

        String n1 = "11111111111111111111111111111111111111111111111111";
        String n2 = "22222222222222222222222222222222222222222222222222";

        BigInteger i1 = new BigInteger(n1);
        BigInteger i2 = new BigInteger(n2);

        System.out.println("Kết quả phép cộng:");
        System.out.println(i1.add(i2));

        System.out.println("Kết quả phép nhân:");
        System.out.println(i1.multiply(i2));
    }
}
