import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);
    static Calculator calc = new Calculator();
    
    public static void main(String[] args) {
        String response;
        
        do {
            try {
                performCalculation();
            } catch (ArithmeticException | UnsupportedOperationException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
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
    
    private static void performCalculation() {
        System.out.print("Введите первое число: ");
        calc.setNumber1(scanner.nextInt());
        
        System.out.print("Введите знак математической операции: ");
        calc.setSign(scanner.next().charAt(0));
        
        System.out.print("Введите второе число: ");
        calc.setNumber2(scanner.nextInt());
        
        int result = calc.calculate();
        System.out.printf("%d %c %d = %d\n", calc.getNumber1(), calc.getSign(), calc.getNumber2(), result);
    }
}