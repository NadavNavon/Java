
    public class CalcEngine{

        // Fields
        private double leftVal;
        private double rightVal;
        private char opCode;
        private double result;

        // Accessors (getters) and Mutators (setters)
        public void setLeftVal (double leftVal) {this.leftVal = leftVal;}
        public double getLeftVal () {return leftVal;};

        public void setRightVal (double rightVal) {this.rightVal = rightVal;}
        public double getRightVal () {return rightVal;};

        public void setOpCode (char opCode) {this.opCode = opCode;}
        public char getOpCode () {return opCode;}

        public double getResult() {return result;}


        // Method (behavior)
        public double MathOperation() {

            switch(opCode){
                case 'a':
                    result = leftVal + rightVal;
                    break;

                case 's':
                    result = leftVal - rightVal;
                    break;

                case 'd':
                    result = rightVal != 0.0d? leftVal/rightVal: 0.0d;
                    break;

                case 'm':
                    result = leftVal * rightVal;
                    break;

                default:
                    System.out.println("Something went wrong");
                    break;
            }
            return result;
        };


    };

