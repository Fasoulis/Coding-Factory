package gr.aueb.cf.ch16.abstractckass;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Hello from the cat");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" ... ate all her food");
    }



    @Override
    public String toString() {
        return getId() + " " + getName();
    }
}
