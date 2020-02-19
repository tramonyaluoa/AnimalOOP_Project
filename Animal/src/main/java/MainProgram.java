public class MainProgram {

    public static void main(String[] args) {

        Home home = new Home();
        Dog dog1  = new Dog();
        Dog dog2  = new Dog();
        Cat cat   = new Cat();
        System.out.println("");


        home.adoptPet(dog1);
        dog1.setName("Rax ");
        home.makeAllSounds();
        System.out.println("");


        home.adoptPet(cat);
        cat.setName("Stormy ");
        home.makeAllSounds();
        System.out.println("");


        home.adoptPet(dog2);
        dog2.setName("Rax ");
        home.makeAllSounds();
    }
}