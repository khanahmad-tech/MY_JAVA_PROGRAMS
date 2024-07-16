package JavaBasics;
class Bulma {
    void eat() {
        System.out.println("She is eating...");
    }
}

public class Dog extends Bulma {
    @Override
    void eat() {
        System.out.println("She is eating.....");
    }

    void cute() {
        System.out.println("Bulma is so cute");
    }
    void work() {
        super.eat();
        cute();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
