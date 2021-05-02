/*
This is a simple calculator to do basic arithmetic but is severely restricted.
*/

public class Calculator {
  //class

  public void basicCalculator(){
    //constructor
  }
  //list of methods for arithmetic
  public double add(int a, int b){
    return a + b;
  }
  public double multiply(int a, int b){
    return a * b;
  }
  public double subtract(int a, int b){
    return a - b;
  }
  public double divide(int a, int b){
    return a / b;
  }
  public double modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.subtract(35, 10));
    System.out.println(myCalculator.add(35, 10));
    System.out.println(myCalculator.divide(35, 10));
    System.out.println(myCalculator.multiply(35, 10));
    System.out.println(myCalculator.modulo(35, 10));
  }
}