package com.training.d17042018_LambdaExpressions_Q2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Use of Lambda in Threads
//        Runnable java7style = new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println("Java 7: \"I'm old and Dead\"");
//            }
//        };
////
//        Thread one = new Thread(java7style);
////
//
//        Runnable ghost = () -> {  System.out.println("Ghost in the Shell!"); };
//        Thread two = new Thread(ghost);
//
//        Thread three = new Thread(() -> { System.out.println("Hello, any Ghost There?"); });
//
//        one.start();
//        two.start();
//        three.start();
//
//
////        // Lambda in Action
//        List<String> names = Arrays.asList("Sanjay", "Rahul", "Darshit", "Sahil", "Sumit", "Pooja", "Sonam", "Pratyush");
////
////        // Forech Accepts Consumer Lambda
//        names.forEach(System.out::println);
////
//        names.forEach(s -> sayHi(s));
//
//        names.forEach(Main::sayHi);
////
//        Consumer<Integer> consumeInt = integer -> {
//            System.out.println("The Integer is "+ integer);
//        };
//
//        System.out.println(names);
//
//        Stream<String> stream = names.stream();
//
//        System.out.println(stream);
////
//        names.stream().map(s -> s.length()).forEach(consumeInt);
//
//        List<String> s1 = names.stream().map(s -> s.toUpperCase()).filter(s -> s.contains("S")).collect(Collectors.toList());
//
//        s1.stream().filter(s -> s.length()>6).forEach(System.out::println);

////
        Currency inr = new Currency(10.0f, "INR");

        String absInrAmount = inr.getAbsoluteAmount((a, c) -> {
            return c + " " + a;
        });

        System.out.println(absInrAmount);

        Currency usd = new Currency(10.0f, "USD");
        Currency gbp = new Currency(20f, "GBP");

        String gbpInUSD = gbp.getAbsoluteAmount((amount, currency) -> {
            return amount * 1.2 + "USD";
        });

        System.out.println(gbpInUSD);
//
        String transformeedAmount = usd.getAbsoluteAmount((amount, currency) -> {
            if (currency.equalsIgnoreCase("USD")){
                return amount*65 + "INR";
            }else if (currency.equalsIgnoreCase("GBP")){
                return amount * 88 + "INR";
            }
            else {
                return amount + " "+currency;
            }
        });
//
        System.out.println(transformeedAmount);

    }

    private static void sayHi(String name){
        System.out.println("Hi, "+name);
    }

}


class Currency{

    private Float amount;
    private String currency;

    public Currency(Float amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getAbsoluteAmount(Transformer transformer){
        return transformer.convert(this.amount, this.currency);
    }
}

@FunctionalInterface
interface Transformer {
    String convert(Float amount, String currency);
}
