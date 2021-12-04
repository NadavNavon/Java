public class Main {

    public static void main(String[] args) {


    Sum student1 = new Sum();

    student1.setNumber1(85);
    student1.setNumber2(95);
    student1.setNumber3(90);

    int s1 = student1.result();
    System.out.println(s1);

    student1.getNumber1();

    }

    //Declare class Sum.
    public static class Sum{

        // Fields
        private int number1;
        private int number2;
        private int number3;
        private int sum;

        // Accessors
        public int getNumber1() { return number1; }
        public int getNumber2() { return number2; }
        public int getNumber3() { return number3; }
        public int getSum() { return sum; }

        // Mutators
        public void setNumber1(int number1) { this.number1 = number1; }
        public void setNumber2(int number2) { this.number2 = number2; }
        public void setNumber3(int number3) { this.number3 = number3; }

        // Method "result"
        public int result() {
            sum = number1 + number2 + number3;
            return sum;
        }

    }

}
