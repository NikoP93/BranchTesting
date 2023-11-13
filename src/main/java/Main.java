public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        dog.eat("dogfood");
        cat.eat("fish");
        dog.mood(true);
        cat.mood(true);
        dog.mood(false);
        cat.mood(false);

    }
}
