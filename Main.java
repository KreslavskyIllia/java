public class Main {

    public static void main(String[] args) {
        doDogsCatsTask();
    }

    static void doDogsCatsTask(){

        Dog dog1 = new Dog ("Бобик");
        dog1.setRunDistance(150);
        dog1.setJumpHeight(0.3);
        dog1.setSwimDistance(11);
        dog1.run();
        dog1.jump();
        dog1.swim();

        Dog dog2 = new Dog("Шарик");
        dog2.setRunDistance(30);
        dog2.setJumpHeight(0.1);
        dog2.setSwimDistance(3);
        dog2.run();
        dog2.jump();
        dog2.swim();

        Cat cat1 = new Cat("Барсик");
        cat1.setRunDistance(200);
        cat1.setJumpHeight(5);
        cat1.run();
        cat1.jump();
        cat1.swim();

        Cat cat2 = new Cat("Мурзик");
        cat2.setRunDistance(70);
        cat2.setJumpHeight(1);
        cat2.run();
        cat2.jump();
        cat2.swim();
    }
}
