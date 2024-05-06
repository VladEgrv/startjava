public class Calculator {
    private int number1;
    private int number2;
    private char sign;
    private int result = Integer.MIN_VALUE;
    
    public int getNumber2() {
        return number2;
    }
    
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    
    public int getNumber1() {
        return number1;
    }
    
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    
    public char getSign() {
        return sign;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }
    
    public int calculation() {
        switch (sign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Делить на ноль нельзя");
                }
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
            default:
                System.out.println("Введенная операция не поддерживается");
                break;
        }
        return result;
    }
}
