package baitap66;

public class TestAnimal {
    public static void main(String[] args) {
        // 1. Kiểm tra lớp Cat
        Cat cat1 = new Cat("Mimi");
        cat1.greets(); // In ra: Meow

        // 2. Kiểm tra lớp Dog
        Dog dog1 = new Dog("Ki");
        Dog dog2 = new Dog("Lu");
        dog1.greets();          // In ra: Woof
        dog1.greets(dog2);      // In ra: Woooof

        // 3. Kiểm tra lớp BigDog
        BigDog bigDog1 = new BigDog("Gâu Gâu");
        BigDog bigDog2 = new BigDog("Héc-quyn");
        bigDog1.greets();              // In ra: Wooow
        bigDog1.greets(dog1);          // In ra: Wooooow (Ghi đè phương thức từ Dog)
        bigDog1.greets(bigDog2);       // In ra: Woooooooooow (Phương thức riêng của BigDog)

        // 4. Kiểm tra tính đa hình (Polymorphism)
        Animal animal1 = new Cat("Meo Meo");
        animal1.greets(); // In ra: Meow (Gọi phương thức của Cat dù khai báo là Animal)

        Animal animal2 = new Dog("Chó Con");
        animal2.greets(); // In ra: Woof
    }
}
