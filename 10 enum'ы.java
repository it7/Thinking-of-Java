/**
 * enum'ы
 *  System.out.println("");
 */

import java.lang.*;

enum myEnum {
    ONE, TWO, ONEONE, THREE
}

public class flo {
    public static void printChar(String... args) {
        for(String s : args)
            System.out.println("" + s);
        System.out.println(args.length);
    }
    public static void main(String[] args){
        myEnum  t = myEnum.ONEONE;
        System.out.println(t.toString() + " " + t.ordinal() + " " + t.values());
    }
}

