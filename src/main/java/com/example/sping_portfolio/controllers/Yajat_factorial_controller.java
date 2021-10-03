package com.example.sping_portfolio.controllers;
import com.example.sping_portfolio.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Yajat_factorial_controller {
//public Class_test factInit(int n, String m){
//    Class_test value = new Class_test(n, m);
//    return value;
//}

    public String factInit_method(int n){
        Yajatfact_for value = new Yajatfact_for(n);
        value.init();
            String name = Yajat_factorial.getName();
            return name;
    }

    public String factInit_value(int n){
        Yajatfact_for value = new Yajatfact_for(n);
        value.init();
        long value2 = Yajat_factorial.getValue();
        String result = Long.toString(value2);

        return result;
    }

    public String factInitwhile_method(int n){
        Yajatfact_while value = new Yajatfact_while(n);
        value.init();
        String name = Yajat_factorial.getName();
        return name;

    }

    public String factInitwhile_value(int n){
        Yajatfact_while value = new Yajatfact_while(n);
        value.init();
        long value2 = Yajat_factorial.getValue();
        String result = Long.toString(value2);

        return result;
    }

    public String factInitrecurse_method(int n){
        Yajatfact_recursion value = new Yajatfact_recursion(n);
        value.init();
        String name = Yajat_factorial.getName();
        return name;

    }

    public String factInitrecurse_value(int n){
        Yajatfact_recursion value = new Yajatfact_recursion(n);
        value.init();
        long value2 = Yajat_factorial.getValue();
        String result = Long.toString(value2);

        return result;
    }

    public String factInitstream_method(int n){
        Yajatfact_stream value = new Yajatfact_stream(n);
        value.init();
        String name = Yajat_factorial.getName();
        return name;

    }

    public String factInitstream_value(int n){
        Yajatfact_stream value = new Yajatfact_stream(n);
        value.init();
        long value2 = Yajat_factorial.getValue();
        String result = Long.toString(value2);

        return result;
    }

//    public List<Yajat_factorial>  factInit(int n){
//    List <Yajat_factorial> factList = new ArrayList<>();
//    factList.add(new Yajatfact_for(n));
////    factList.add(new Yajatfact_while(n));
//    return factList;
//}
@GetMapping("/yajat_factorial")
    public String fact(@RequestParam(name= "factorial", required=false, defaultValue="0") String factorial, Model model){
    int x = Integer.parseInt(factorial);
    model.addAttribute("for_Method_Used", factInit_method(x));
    model.addAttribute("for_factorial_value", factInit_value(x));
    model.addAttribute("while_Method_Used", factInitwhile_method(x));
    model.addAttribute("while_factorial_value", factInitwhile_value(x));
    model.addAttribute("recurse_factorial_name", factInitrecurse_method(x));
    model.addAttribute("recurse_factorial_value", factInitrecurse_value(x));
    model.addAttribute("stream_factorial_name", factInitstream_method(x));
    model.addAttribute("stream_factorial_value", factInitstream_value(x));


    return "/yajat_factorial";
}
//    public static void main(String[] args) {
//
////        Yajat_factorial factorial = new Yajatfact_for(4); //
//        abc = new Yajat_factorial_controller();
//    abc.factInit(5).print();
//    }
}
