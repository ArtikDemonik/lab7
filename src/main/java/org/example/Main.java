package org.example;

import java.util.Scanner;

public class Main {
    public static double[] filler(){
        Scanner in = new Scanner(System.in);
        double[] result = new double[3];
        for (int i = 0; i < 2; i++) {
            result[i] = in.nextDouble();
        }
        return result;
    }

    public static void main(String[] args) {
        CalculateValues calc1 = new CalculateValues(filler());
        CalculateValues calc2 = new CalculateValues(filler());
        CalculateValues calc3 = new CalculateValues(filler());
        CalculateValues[] arr = {calc1, calc2, calc3};
        for(CalculateValues i:arr){
            System.out.println(i.calculate1());
            System.out.println(i.calculate2());
            System.out.println(i.calculate3());
        }
    }
}
