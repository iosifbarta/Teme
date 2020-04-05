package org.fasttrackit;

public class LogicalOP {
    public void increase (int number){
        if (number > 100){
            System.out.println("Please enter a number a valid number");
        }for(int i = number; i <100; i++){
            int numberIncrease = i + 1;
            System.out.println(numberIncrease);
        }
    }
    public void decrease (int number){
        if (number < -100){
            System.out.println("Please enter a number a valid number");
        }for(int i = number; i > -100; i--){
            int numberDecrease = i - 1;
            System.out.println(numberDecrease);
        }
    }
    public void counting (int x, int y){
            for (int i = x; i < y; i++){
                int countingNumber = i + 1;
                System.out.println(countingNumber);
        }
    }
    public void counting2(int x, int y){
        if(x < y){
            for (int i = x; i < y; i++){
                int countingNumber = i + 1;
                System.out.println(countingNumber);

            }
        }
        if(x > y){
            for (int i = x; i > y; i--){
                int countingNumber = i - 1;
                System.out.println(countingNumber);
            }
        }
    }
    public void numerePare (int x, int y){

        for (int i = 0; i < y; i +=2){
            int numerPar = i + 2;
            System.out.println(numerPar);
        }

    }
    public void numereImpare (int x, int y){

        for (int i = 1; i < y - 1; i +=2){
            int numarImpar = i + 2;
            System.out.println(numarImpar);
        }

    }
    public int suma (int x){
        int sum = 0;
        if (x > 100){
            System.out.println("Please enter a valid number");
        }
        for(int i = x; i <=100; i++){
            sum += i;
        }return sum;
    }
    public double media (int x){
        double medie = 0;
        int count = 0;
        int sum = 0;
        if (x > 100){
            System.out.println("Please enter a valid number");
        }
        for(int i = x; i <=100; i++){
            sum += i;
            count ++;
            medie = sum / count;
        }return medie;
    }
    public void asterisk() {
        for (int row = 1; row <= 7; row++) {
            for (int column = 7; column >= 1; column--) {
                if (column >= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
