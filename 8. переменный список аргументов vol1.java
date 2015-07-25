/**
 * массивы и переменный список аргументов"
 *  System.out.println("");
 */

import java.lang.*;

class A { int i;}

public class flo {
    static void printArray(Object[] args) {
            for(Object obj : args)
                System.out.println(obj + " ");
            System.out.println();
    }
    public static void main(String[] args){
        printArray( new Object[]{
            new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A()});
    }
}

