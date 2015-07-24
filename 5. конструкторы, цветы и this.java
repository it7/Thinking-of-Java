/**
 * Created by k on 7/24/15.
 */

import java.lang.*;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalcount = "
                + petals );
    }
    Flower(String ss) {
        System.out.println("Конструктор с параметром String, s = "
                + ss );
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
    //! this(s); вызов другого параметра запрещен!
        this.s = s; //другое использование this
        System.out.println("Конструктор с параметром String и int");
    }
    Flower() {
        this("hi", 47);
        System.out.println("Конструктор по умолчанию");
    }

    public static void main(String[] args) {
        Flower x = new Flower();
    }
}
