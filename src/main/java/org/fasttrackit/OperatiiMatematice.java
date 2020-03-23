package org.fasttrackit;

public class OperatiiMatematice {
    int numbers;


    public int adunarea(int number1, int number2){
        int num = number1 + number2;
        System.out.println("Cele doua variabile adunate au suma de: " +num);
        return numbers;
    }

    public int scaderea(int number1, int number2) {
        int num = number1 - number2;
        System.out.println("Rezultatul scaderii variabilei2 din variabila1, este: " + num);
        return numbers;
    }

    public int inmultirea(int number1, int number2) {
        int num = number1 * number2;
        System.out.println("Inmultirea celor 2 variabile date este: " + num);
        return numbers;
    }
    public float impartirea(int number1, int number2) {
        float num = number1 / number2;
        System.out.println("Impartirea celor 2 variabile date este: " + num);
        return numbers;
    }
}
