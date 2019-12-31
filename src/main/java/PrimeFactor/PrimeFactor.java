package PrimeFactor;

import java.util.ArrayList;

public class PrimeFactor {
    public static ArrayList<Integer> of(int n){
        ArrayList<Integer> factors;
        factors = new ArrayList<>();
        if(n == 2){
            factors.add(2);
        }
        return factors;
    }
}
