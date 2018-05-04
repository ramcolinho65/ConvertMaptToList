package com.ramco.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {

    public static void main(String args[]) {

        Map<Integer,String> integerStringMap = new HashMap<>();


                integerStringMap.put(1,"x");
                integerStringMap.put(2,"y");
                integerStringMap.put(3,"z");
                integerStringMap.put(4,"t");
                integerStringMap.put(5,"r");


        List<Integer> result1 = new ArrayList<>(integerStringMap.keySet()); // Keyleri Listemize Attık.

        System.out.println("result1 = " + result1); // oluşturduğumuz mapte'ki Key'leri alıp bastık ;

        result1.forEach(System.out::println); // ForEach ile dolaşıpta keyleri basabilirsiniz.

        System.out.println("-----------------------------------------------------------------");

        List<String> result2 = new ArrayList(integerStringMap.values());  //Value değerlerimiz Listemize aldık

        System.out.println("result2 = " + result2); // oluşturduğumuz mapte'ki Value değerini alıp bastık ;

        result2.forEach(System.out::println); // ForEach ile dolaşıpta value basabilirsiniz.



        System.out.println("----Java 8 Stream ile kullanım------");

        List<Integer> map2 = integerStringMap.keySet().stream()  //KEylerimizi aldık Liste şeklinde döndük.
                .collect(Collectors.toList());

         map2.forEach(System.out::println);  // keylerimizi yazdırdık

        System.out.println("---");

        List<String> map3 = integerStringMap.values().stream().collect(Collectors.toList()); // Value değerlerimiz aldık.

        map3.forEach(System.out::println);









    }
}
