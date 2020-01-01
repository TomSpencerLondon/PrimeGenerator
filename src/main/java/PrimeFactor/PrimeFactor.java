package PrimeFactor;

import java.util.ArrayList;

public class PrimeFactor {
    public static ArrayList<Integer> of(int n){
        ArrayList<Integer> factors;
        factors = new ArrayList<>();
        if(n > 1){
            while(n % 2 == 0){
                factors.add(2);
                n /= 2;
            }
            if (n > 1)
                factors.add(n);
        }
        return factors;
    }
}
