package ru.gavrdmg;


public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c = 5.0;
        double d = 3.0;
        int outOfRange = Integer.MAX_VALUE + 1;
        System.out.printf("a=%d b=%d c=%f d=%f\n", a, b, c, d);
        System.out.printf("a-b=%d \n", a - b);
        System.out.printf("a+b=%d \n", a + b);
        System.out.printf("a-b=%d \n", a - b);
        System.out.printf("a*b=%d \n", a * b);
        System.out.printf("b/a=%d \n", b / a);
        System.out.printf("c+a*(c-b)=%f \n", c + a * (c - b));
        System.out.printf("a>b = %b \n", a > b);
        System.out.printf("b<c = %b \n", b < c);
        System.out.printf("b<=d = %b \n", b <= d);
        System.out.println(outOfRange);
    }
}