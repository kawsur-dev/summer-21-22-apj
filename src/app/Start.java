package app;

import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Sum<Integer, Integer> a = new Sum<Integer, Integer>(10 , 10);
        System.out.println(a.add());

        Sum<Double, Double> a1 = new Sum<Double, Double>(10.1 , 9.9);
        System.out.println(a1.add());

        System.out.println(a.isEqual(a1));
    }
}
