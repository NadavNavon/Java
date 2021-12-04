public class Main {

    public static void main(String[] args) {


     // Array declaration and loop

    float[] theVals = new float[3];
    theVals[0] = 10.0f;
    theVals[1] = 20.0f;
    theVals[2] = 30.0f;
    float sum = 0.0f;

    for (int i = 0 ; i < theVals.length; i++) {
        sum += theVals[i];
    }
    System.out.println(sum);


    float[] theVals2 = {10.0f, 20.0f, 30.0f};
    float sum2 = 0.0f;

    for (int i = 0 ; i < theVals2.length; i++) {
        sum2 += theVals[i];
    }
    System.out.println(sum2);






    }
}
