package ru.geekbrains.lesson1;

public class MainApp {

        //1
        public static void main(String[] args) {
        }

        //2
        byte a=-120;
        short b = 12442;
        int c = 1000;
        long d = 200000L;
        float e = 12.23f;
        double f = -123.123;
        char g = 0;
        boolean j = false;
        boolean k = true;

        //3

    public static float makeCalc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

        //4
    public static boolean checkSum (int a, int b) {
    int sum = a + b;
        if (sum >= 10 && sum <= 20) {
        return true;
        } else {
        return false;
        }
    }

        //5
    public static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

        //6
        public static boolean checkNegative(int a) {
            if (a < 0) {
                return true;
            } else {
                return false;
            }
        }

        //7
    public static void greetings(String name){
            System.out.println("Привет, " + name +"!");
    }

        //8
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}


