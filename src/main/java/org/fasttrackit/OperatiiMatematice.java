package org.fasttrackit;

public class OperatiiMatematice {
    int numbers;

    public void adunarea(int number1, int number2){
        int num = number1 + number2;
        System.out.println("Cele doua variabile adunate au suma de: " +num);
    }

    public void scaderea(int number1, int number2) {
        int num = number1 - number2;
        System.out.println("Rezultatul scaderii variabilei2 din variabila1, este: " + num);
    }

    public void inmultirea(int number1, int number2) {
        int num = number1 * number2;
        System.out.println("Inmultirea celor 2 variabile date este: " + num);
    }
    public void impartirea(int number1, int number2) {
        double num = number1 / number2;
        System.out.println("Impartirea celor 2 variabile date este: " + num);
    }
}
