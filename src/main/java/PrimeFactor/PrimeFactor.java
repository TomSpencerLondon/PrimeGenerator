package PrimeFactor;

import java.util.ArrayList;

public class PrimeFactor {
    public static ArrayList<Integer> of(int n){
        ArrayList<Integer> factors;
        factors = new ArrayList<>();
        int divisor = 2;
        while(n > 1){
            while(n % divisor == 0){
                factors.add(divisor);
                n /= divisor;
            }
            divisor += 1;
        }
        return factors;
    }
}
