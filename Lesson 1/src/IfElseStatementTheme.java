import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        char userGender = 'F';
        if (userGender != 'M') {
            System.out.println("User gender is female");
        } else {
            System.out.println("User gender is male");
        }
        
        byte userAge = 18;
        if (userAge > 18) {
            System.out.println("User is adult");
        } else {
            System.out.println("User is underage");
        }
        
        float userHeight = 1.9f;
        if (userHeight > 1.8) {
            System.out.println("Tall user");
        } else {
            System.out.println("Average height user");
        }
        
        
        char firstLetterUserName = "Ivan".charAt(0);
        if (firstLetterUserName == 'M') {
            System.out.println("Username starts with M");
        } else if (firstLetterUserName == 'I') {
            System.out.println("Username starts with I");
        } else {
            System.out.println("Username does not start with the specified letters");
        }
        
        System.out.println("\n2. Поиск большего числа");
        int num1 = 5;
        int num2 = 3;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " больше числа " + num1);
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3. Проверка числа");
        int checkedNum = -3;
        if (checkedNum == 0) {
            System.out.println("Число равно нулю");
        } else if (checkedNum > 0) {
            if (checkedNum % 2 == 0) {
                System.out.println(checkedNum + " является положительным и четным");
            } else {
                System.out.println(checkedNum + " является положительным и нечетным");
            }
        } else if (checkedNum < 0) {
            if (checkedNum % 2 == 0) {
                System.out.println(checkedNum + " является отрицательным и четным");
            } else {
                System.out.println(checkedNum + " является отрицательным и нечетным");
            }
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int threeDigitNum1 = 123;
        int threeDigitNum2 = 223;
        if ((threeDigitNum1 % 10) != (threeDigitNum2 % 10) &
                ((threeDigitNum1 % 100) / 10) != ((threeDigitNum2 % 100) / 10) &
                (threeDigitNum1 / 100) != (threeDigitNum2 / 100)) {
            System.out.println("Равных цифр нет");
        } else {
            System.out.println("Исходные числа: " + threeDigitNum1 + " | " + threeDigitNum2);
            if ((threeDigitNum1 % 10) == (threeDigitNum2 % 10)) {
                int tempNum = threeDigitNum1 % 10;
                System.out.println("Цифра: " + tempNum + ". Разряд: 1");
            }
            if ((threeDigitNum1 % 100) / 10 == (threeDigitNum2 % 100) / 10) {
                int tempNum = (threeDigitNum1 % 100) / 10;
                System.out.println("Цифра: " + tempNum + ". Разряд: 2");
            }
            if (threeDigitNum1 / 100 == threeDigitNum2 / 100) {
                int tempNum = threeDigitNum1 / 100;
                System.out.println("Цифра: " + tempNum + ". Разряд: 3");
            }
        }
        
        System.out.println("\n5. Определение символа по его коду");
        char symbolCode = '\u0031';
        if (symbolCode >= 'A' & symbolCode <= 'Z') {
            System.out.println("Символ " + symbolCode + " является большой буквой");
        } else if (symbolCode >= 'a' & symbolCode <= 'z') {
            System.out.println("Символ " + symbolCode + " является маленькой буквой");
        } else if (symbolCode >= '0' & symbolCode <= '9') {
            System.out.println("Символ " + symbolCode + " является цифрой");
        } else {
            System.out.println("Символ " + symbolCode + " не буква и не цифра");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        BigDecimal deposit = new BigDecimal(301000);
        System.out.println("Сумма вклада: " + deposit);
        BigDecimal rateMin = new BigDecimal("0.05");
        BigDecimal rateAverage = new BigDecimal("0.07");
        BigDecimal rateMax = new BigDecimal("0.10");
        if (deposit.compareTo(new BigDecimal(100000)) < 0) {
            BigDecimal charges = deposit.multiply(rateMin);
            System.out.println("Сумма накопленного процента: " + charges + "\nИтоговая сумма с процентами: " +
                    deposit.add(charges));
        } else if (deposit.compareTo(new BigDecimal(100000)) >= 0 &
                deposit.compareTo(new BigDecimal(300000)) <= 0) {
            BigDecimal charges = deposit.multiply(rateAverage);
            System.out.println("Сумма накопленного процента: " + charges + "\nИтоговая сумма с процентами: " +
                    deposit.add(charges));
        } else if (deposit.compareTo(new BigDecimal(300000)) > 0) {
            BigDecimal charges = deposit.multiply(rateMax);
            System.out.println("Сумма накопленного процента: " + charges + "\nИтоговая сумма с процентами: " +
                    deposit.add(charges));
        }
        
        System.out.println("\n7. Определение оценки по предметам");
        int historyRate = 59;
        int programmingRate = 92;
        int historyMark = 0;
        int programmingMark = 0;
        
        if (historyRate <= 60) {
            historyMark = 2;
        } else if (historyRate > 60 & historyRate <= 73) {
            historyMark = 3;
        } else if (historyRate > 73 & historyRate <= 91) {
            historyMark = 4;
        } else if (historyRate > 91) {
            historyMark = 5;
        }
        
        if (programmingRate <= 60) {
            programmingMark = 2;
        } else if (programmingRate > 60 & programmingRate <= 73) {
            programmingMark = 3;
        } else if (programmingRate > 73 & programmingRate <= 91) {
            programmingMark = 4;
        } else if (programmingRate > 91) {
            programmingMark = 5;
        }
        
        float averageRate = (float) (historyRate + programmingRate) / 2;
        float averageMark = (float) (historyMark + programmingMark) / 2;
        
        System.out.println("История — " + historyMark + "\n" +
                "Программирование — " + programmingMark + "\n" +
                "Средний балл оценок по предметам — " + averageMark + "\n" +
                "Средний % по предметам — " + averageRate);
        
        System.out.println("\n8. Расчет годовой прибыли");
        BigDecimal revenueMonth = new BigDecimal("13000");
        BigDecimal rentMonth = new BigDecimal("5000");
        BigDecimal productionCostMonth = new BigDecimal("9000");
        char sign = '+';
        
        BigDecimal incomeMonth = revenueMonth.subtract(rentMonth).subtract(productionCostMonth);
        BigDecimal incomeYear = incomeMonth.multiply(new BigDecimal("12"));
        if (incomeYear.compareTo(new BigDecimal("0")) > 0) {
            System.out.println("Прибыль за год: " + sign + incomeYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + incomeYear + " руб.");
        }
    }
}
