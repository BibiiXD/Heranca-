public class Principal {
    public static void main(String[] args) {
        Dog dog = new Dog("Dandara", 12);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());

        Cat cat = new Cat("Vilma Tereza", 13);
        Cat cat1 = new Cat("Amora", 5);

        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());
        System.out.println(cat1.getNome());
        System.out.println(cat1.getIdade());

    }
}
