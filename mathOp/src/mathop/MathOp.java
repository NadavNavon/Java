/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathop;

/**
 *
 * @author nadavnavon
 */
public class MathOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      int valA = 21;
      int valB = 4;
      int valC = 7;
      int valD = 2;
      
      System.out.println(valD + valA);
      
      int result1 = valA - valB / valC;
      int result2 = (valA - valB) / valC;

      System.out.println(result1);
      System.out.println(result2);
      
      
      // -------------------------------- 
      
      //Examples for Type conversions
      
      float floatVal = 1.0f;
      double doubleVal = 4.0d;
      byte byteVal = 7;
      short shortVal = 7;
      long longVal = 5; 
      
      short result11 = byteVal; // Works, widening conversion
      
      //short result22 = longVal; // Error, possible lossy conversion 
      short results22 = (short)longVal; // Works. Explicit type conversion
      
      //short result33 = byteVal - longVal; // Error, result is a long. 
      short result33 = (short)(byteVal - longVal); //Works. Explicit type conversion. 
      
      //long result44 = longVal - floatVal; // Error. result is a float 
      float result44 = longVal - floatVal;
      
      

      
      System.out.println("Success");
      
      
    }
    
}
