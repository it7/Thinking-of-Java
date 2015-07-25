/**
 * инициализация экземпляра"
 */

import java.lang.*;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class flo{
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialization");
    }
    flo() {
        System.out.println("Mugs");
    }
    flo(int i) {
        System.out.println("Mugs(" + i + ")");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new flo();
        System.out.println("Mugs done");
        new flo(1);
        System.out.println("Mugs(1) done");
    }
}
