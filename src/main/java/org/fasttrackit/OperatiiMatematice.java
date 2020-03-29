package org.fasttrackit;

public class OperatiiMatematice {
    int numbers;


    public int adunarea(int number1, int number2){
        int num = number1 + number2;
        System.out.println("adunarea: " + number1 + " + " + number2 + " = " + num);
        return num;
    }

    public int scaderea(int number1, int number2) {
        int num = number1 - number2;
        System.out.println("scaderea: " + number1 + " - " + number2 + " = " + num);
        return num;
    }

    public int inmultirea(int number1, int number2) {
        int num = number1 * number2;
        System.out.println("inmultirea: " + number1 + " * " + number2 + " = " + num);
        return num;
    }
    public double impartirea(double number1, double number2) {
        double num = number1 / number2;
        System.out.println("impartirea: " + number1 + " / " + number2 + " = " + num);
        return num;
    }
}
