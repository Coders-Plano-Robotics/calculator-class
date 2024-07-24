public class Main {
  public static void main(String[] args) {
    double calculatedValue = 0;
    Calculator calculator = new Calculator();

    System.out.println("Adding 1 and 2");
    calculatedValue = calculator.add(1, 2);
    System.out.println(calculatedValue); // Prints out 3

    System.out.println("Adding 3");
    calculatedValue = calculator.add(3);
    System.out.println(calculatedValue); // Prints out 6

    System.out.println("Adding 1 and 1");
    calculatedValue = calculator.add(1, 1);
    System.out.println(calculatedValue); // Prints out 2
  }
}
