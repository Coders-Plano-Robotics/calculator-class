/*
 * A simple calculator class that can add two numbers together.
 */
public class Calculator {
  private double storedNumber;

  public Calculator() {
    storedNumber = 0;
  }

  /*
   * Adds two numbers together and returns the result.
   * 
   * Stores the result in memory.
   */
  public double add(double value1, double value2) {
    storedNumber = value1 + value2;
    return storedNumber;
  }

  /*
   * Adds number to the stored number and returns the result.
   */
  public double add(double value) {
    storedNumber += value;
    return storedNumber;
  }

  public double subtract(double value1, double value2) {
    // Complete here
    return 0.0;
  }

  public double subtract(double value) {
    // Complete here
    return 0.0;
  }

  public double multiply(double value1, double value2) {
    // Complete here
    return 0.0;
  }

  public double multiply(double value) {
    // Complete here
    return 0.0;
  }

  public double divide(double value1, double value2) {
    // Complete here, watch out for zero!
    return 0.0;
  }

  public double divide(double value) {
    // Complete here, watch out for zero!
    return 0.0;
  }
}
