package com.example.sping_portfolio;

public class Yajatfact_for extends Yajat_factorial {

    public Yajatfact_for(int num) {

        super(num);
    }
//
//    public void setValue(long output){
//        super.final_value = output;
//    }

    @Override
//    protected
    public void init() {
        super.name = "For Loop";
        long output = 1;
        for (int x = 1; x <= super.size; x++) {
            output = output * x;
            super.final_value = (output);

        }
    }

    public static void main(String[] args) {

        Yajatfact_for tester = new Yajatfact_for(7);
        tester.init();
        Yajat_factorial.getName();
        Yajat_factorial.getValue();

//
//        Yajatfact_for tester = new Yajatfact_for(5);
//        tester.init();
//        Yajat_factorial factorial = new Yajatfact_for(10);
//        factorial.print();

//    public long getValue(){

//    }

//    public static void main(String[] args) {
//
//        Yajat_factorial factorial = new Yajatfact_for();
//
//        int userinput = 7;
//        int output = 1;
//
//        for (int x = 1; x <= userinput; x++) {
//            output = output * x;
//        }
//
//        System.out.println(output);
//    }
    }
}

