import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);
    static Calculator calc = new Calculator();
    
    public static void main(String[] args) {
        String response;
        
        do {
            try {
                int result = performCalculation();
                displayResult(result);
            } catch (ArithmeticException | UnsupportedOperationException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Введены некорректные данные.");
                scanner.nextLine();
            }
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                response = scanner.next();
            } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));
        } while (response.equalsIgnoreCase("yes"));
        
        scanner.close();
    }
    
    private static int performCalculation() {
        System.out.print("Введите первое число: ");
        calc.setArg1(scanner.nextInt());
        
        System.out.print("Введите знак математической операции: ");
        calc.setSign(scanner.next().charAt(0));
        
        System.out.print("Введите второе число: ");
        calc.setArg2(scanner.nextInt());
        
        return calc.calculate();
    }
    
    private static void displayResult(int result) {
        System.out.printf("%d %c %d = %d\n", calc.getArg1(), calc.getSign(), calc.getArg2(), result);
    }
}