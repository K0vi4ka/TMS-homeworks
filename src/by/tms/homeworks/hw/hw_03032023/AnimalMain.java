package by.tms.homeworks.hw.hw_03032023;


public class AnimalMain {

    public static void main(String[] args) {
        Feeline cat = new Cat("cat.jpeg", "кошачий корм", 5, new Animal.Boundaries(1, 1), new Animal.Location(3, 4));
        Feeline lion = new Lion("lion.jpeg", "мясо", 8, new Animal.Boundaries(2, 3), new Animal.Location(1, 7));
        Feeline tiger = new Tiger("tiger.jpeg", "мясо", 3, new Animal.Boundaries(5, 3), new Animal.Location(2, 8));

        Canine dog = new Dog("dog.jpeg", "собачий корм", 8, new Animal.Boundaries(1, 2), new Animal.Location(3, 5));
        Canine wolf = new Wolf("wolf.jpeg", "мясо", 1, new Animal.Boundaries(1, 4), new Animal.Location(4, 6));

        Animal hippo = new Hippo("hippo.jpeg", "траву", 6, new Animal.Boundaries(1, 5), new Animal.Location(1, 7));

        Animal[] animals = new Animal[]{cat, dog, hippo};
        Feeline[] feeline = new Feeline[]{cat, lion, tiger};
        Canine[] canine = new Canine[]{dog, wolf};

        for (Animal anim : animals) {
            anim.makeNoize();
            anim.eat();
            anim.sleep();
            anim.roam();
            System.out.println("----------------------");
        }

        for (Feeline feel : feeline) {
            feel.makeNoize();
            feel.eat();
            feel.sleep();
            feel.roam();
            System.out.println("----------------------");
        }

        for (Canine canine1 : canine) {
            canine1.makeNoize();
            canine1.eat();
            canine1.sleep();
            canine1.roam();
            System.out.println("----------------------");
        }

        Animal.animalsArray[0] = cat;
        Animal.animalsArray[1] = lion;
        Animal.animalsArray[2] = tiger;
        Animal.animalsArray[3] = wolf;
        Animal.animalsArray[4] = dog;
        Animal.animalsArray[5] = hippo;
        AnimalMenu.drawMainMenu();
    }
}
