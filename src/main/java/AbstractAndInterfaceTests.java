import animal.Animal;
import animal.Tiger;
import animal.Checken;
import edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Checken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Checken) {
                Edible edibler = (Checken) animal;
                System.out.println(edibler.howToEat());

            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
