package animal;

import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new ChicKen();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if(animal instanceof ChicKen){
                Edible edible = (ChicKen) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits ){
            System.out.println(fruit.howToEat());
        }
    }
}
