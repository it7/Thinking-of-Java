//представление 16 и 8 -х чисел в двоичной с/с
import java.util.*;

public class Assignment {
    public static void main (String[] args) {
        long i1 = 0x2f; //шеснадцатеричное
        System.out.println("i1: " + Long.toBinaryString(i1));
        System.out.println("i1: " + i1);
        i1 = 0767; //восьмеричное (начинается с нуля)
        System.out.println("i1: " + Long.toBinaryString(i1));
        System.out.println("i1: " + i1);
    }
}

