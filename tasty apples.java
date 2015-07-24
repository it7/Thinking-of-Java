/**
 * Created by k on 7/24/15.
 */

import java.util.*;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Tasty!");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        //снимаем кожуру
        return apple;
    }
}

class Apple {
    Apple getPeeled() { return Peeler.peel(this); }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

