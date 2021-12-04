public class Main {


    public static void main(String[] args) {

    // Creating a new class instance (i.e an object named calc1)
    CalcEngine calc1 = new CalcEngine();

    // Setting states for the new object
    calc1.setLeftVal(10.0d);
    calc1.setRightVal(5.0d);
    calc1.setOpCode('a');

    // Execute the behavior of the object
    calc1.MathOperation();

    System.out.println(calc1.getResult());

    }
}
