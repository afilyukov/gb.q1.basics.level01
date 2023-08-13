public class Lesson06 {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        System.out.println(cat1.run(300));
        System.out.println(cat1.run(100));
        System.out.println(dog1.jump(1.0f));
        System.out.println(dog1.run(303));

        Animal dog2 = new Dog(400, 1f, 10);
        System.out.println(dog2.run(500));
    }
}