package com.example.sping_portfolio;

import java.util.stream.LongStream;

public class Yajatfact_stream extends Yajat_factorial {

    public Yajatfact_stream(int num) {

        super(num);
    }

    public long factorial_stream(int n){
        return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
    }

    @Override
    public void init() {
        super.name = "Stream";
        long output = 1;
        int end = super.size;

        super.final_value = factorial_stream(end);

    }


}



