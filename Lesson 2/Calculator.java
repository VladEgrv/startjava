public class Calculator {
    private int arg1;
    private int arg2;
    private char sign;
    
    public int getArg1() {
        return arg1;
    }
    
    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }
    
    public int getArg2() {
        return arg2;
    }
    
    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }
    
    public char getSign() {
        return sign;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }
    
    public int calculate() {
        switch (sign) {
            case '+':
                return arg1 + arg2;
            case '-':
                return arg1 - arg2;
            case '*':
                return arg1 * arg2;
            case '/':
                if (arg2 == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                return arg1 / arg2;
            case '%':
                if (arg2 == 0) {
                    throw new ArithmeticException("Остаток от деления на ноль невозможен");
                }
                return arg1 % arg2;
            case '^':
                int result = 1;
                for (int i = 0; i < arg2; i++) {
                    result *= arg1;
                }
                return result;
            default:
                throw new UnsupportedOperationException("Операция " + sign + " не поддерживается");
        }
    }
}
