import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator newCalculation = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Введите первое число: ");
            newCalculation.setNumber1(scanner.nextInt());
            
            System.out.print("Введите знак математической операции: ");
            newCalculation.setSign(scanner.next().charAt(0));
            
            System.out.print("Введите второе число: ");
            newCalculation.setNumber2(scanner.nextInt());
            
            if (newCalculation.calculation() > Integer.MIN_VALUE) {
                System.out.printf("%d %c %d = %s\n", newCalculation.getNumber1(), newCalculation.getSign(),
                        newCalculation.getNumber2(), newCalculation.calculation());
            }
            
            String response;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                response = scanner.next();
                if (response.equals("no")) {
                    System.exit(0);
                }
            } while (!response.equals("yes"));
        } while (true);
    }
}
