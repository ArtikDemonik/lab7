package org.example;

public class CalculateValues {
    private double a, x, b;
    CalculateValues(double a, double x, double b){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    CalculateValues(double[] arr){
        this.a = arr[0];
        this.b = arr[1];
        this.x = arr[2];
    }
    public double calculate1() {
        return 3 * this.x + 5;
    }

    public double calculate2() {
        if(a-b!=0)
            return (a + b) / (a - b);
        else
            return -1;
    }

    public double calculate3() {
        if(b!=0)
            return Math.pow(a * x / b, b);
        else
            return -1;
    }

}
