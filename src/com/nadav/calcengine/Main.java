package com.nadav.calcengine;

public class Main {

    public static void main(String[] args) {

        double val1 = 100.d;
        double val2 = 2.d;
        double result;
        char opCode = 'add';

        if (opCode == 'add')
            result = val1 + val2;

        else if (opCode == 'subtract')
            result = val1 - val2;

        else if (opCode == 'divide')
            result = val2 != 0 ? val1/val2: 0.0d;

        else if (opCode == 'multiply')
            result = val1 * val2;

        else
            System.out.println("Valid opCode");


        System.out.println(result);


    }
}
