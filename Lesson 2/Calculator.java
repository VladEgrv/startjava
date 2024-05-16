public class Calculator {
    private int number1;
    private int number2;
    private char sign;
    
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
    
    public int calculate() throws ArithmeticException, UnsupportedOperationException {
        switch (sign) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                return number1 / number2;
            case '%':
                return number1 % number2;
            case '^':
                int result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                return result;
            default:
                throw new UnsupportedOperationException("Операция " + sign + " не поддерживается");
        }
    }
}
