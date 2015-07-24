//coin toss imitation

import java.util.*;

public class Assignment {
    public static void main (String[] args) {
        boolean i;
        int count = 0;
        Random rand = new Random(47);

        while(count < 10){
            count++;
            i = rand.nextBoolean();
            if(i)
                System.out.println(count + " Heads");
            else
                System.out.println(count + " Tails" );

        }
    }
}
