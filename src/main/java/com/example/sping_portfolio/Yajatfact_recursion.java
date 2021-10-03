package com.example.sping_portfolio;

public class Yajatfact_recursion extends Yajat_factorial {

    public Yajatfact_recursion(int num) {

        super(num);
    }
    public int factorial_recurse(int n){
        if (n == 0)
            return 1;
        else {
            return (n * factorial_recurse(n - 1));

        }
    }
    @Override
    public void init() {
        super.name = "Recursion";
        long output = 1;
        int end = super.size;
        output = factorial_recurse(end);
        super.final_value = output;

    }


}



