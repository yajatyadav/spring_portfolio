package com.example.sping_portfolio;

public class Yajatfact_while extends Yajat_factorial {

    public Yajatfact_while(int num) {

        super(num);
    }

    @Override
    public void init() {
        super.name = "While Loop";
        long output = 1;
        int end = super.size;
        while (end > 1) {
            output = output * end;
            end -= 1;
        }
        super.final_value = output;

    }


}



