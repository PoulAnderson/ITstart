package itsStart;

public class Dog {
    public static void main(String[] args) {
        StaticRex rex = new StaticRex();
        rex.frendlyDog();

        StaticRex.dogFeed();
    }
}

    class StaticRex {

        public void frendlyDog() {
            System.out.println("dog love people");
        }

        public static void dogFeed() {
            System.out.println("feedeng the dog");
        }
    }
