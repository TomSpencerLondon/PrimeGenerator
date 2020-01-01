package PrimeFactor;

import java.util.ArrayList;

public class PrimeFactor {
    public static ArrayList<Integer> of(int n){
        ArrayList<Integer> factors;
        factors = new ArrayList<>();
        for(int divisor = 2; n > 1; divisor++)
            for(;n % divisor == 0; n /= divisor)
                factors.add(divisor);
        return factors;
    }
}
