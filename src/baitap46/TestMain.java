package baitap46;

public class TestMain {
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        System.out.println(a);

        Mammal m = new Mammal("Manny");
        System.out.println(m);

        Cat c = new Cat("Kitty");
        System.out.println(c);
        c.greets();

        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Buddy");
        System.out.println(d1);
        d1.greets();      // Woof
        d1.greets(d2);    // Woooof
    }
}