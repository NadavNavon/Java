public class Main {

    public static void main(String[] args) {


        // While loop
        int kVal = 5;
        int factorial = 1;
        while (kVal > 1) {
            factorial *= kVal--;
        }
        ;

        System.out.println(factorial);

        // Do while loop
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        }
        while (iVal < 100);

        // for loop
        for (int jVal = 1; jVal < 100; jVal *= 2)
            System.out.println(jVal);


        // for-each loop

        float[] theVals = {10.0f, 20.0f, 30.0f};
        float sum = 0.0f;

        for (float i : theVals){
            sum += i;
        };

        System.out.println("\n" + sum);








    }
}
