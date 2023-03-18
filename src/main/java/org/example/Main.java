package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Получается "+ sum(10,5));
        System.out.println("Получается "+ sum(10,5)+ "   "+sum(10,5));
        System.out.println("Commit 1");
    }
    public static int sum (int a, int b) {
        return a+b;
    }
}