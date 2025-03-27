
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        System.out.println("-----Testing Dog-----");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        System.out.println("-----Testing Cat-----");

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        System.out.println("-----Testing NoiseCapable-----");

        NoiseCapable dog2 = new Dog();
        dog2.makeNoise();

        //NoiseCapable object can call makeNoise, but not Cat purr() method until casting to Cat type
        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();

        //cast NoiseCapable object cat2 to type Cat to call purr() method
        Cat c = (Cat) cat2;
        c.purr();


    }

}
