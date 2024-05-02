package lesson1;

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
        } else {
            String parity = "нечетным";
            if (checkedNum % 2 == 0) {
                parity = "четным";
            }
            String signNum = "отрицательным";
            if (checkedNum > 0) {
                signNum = "положительным";
            }
            System.out.println(checkedNum + " является " + signNum + " и " + parity);
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        System.out.println("Исходные числа: " + num1 + " | " + num2);
        boolean hasEqualOnes = (num1 % 10) == (num2 % 10);
        boolean hasEqualTens = (num1 % 100) / 10 == (num2 % 100) / 10;
        boolean hasEqualHundreds = num1 / 100 == num2 / 100;
        if (!hasEqualOnes && !hasEqualTens && !hasEqualHundreds) {
            System.out.println("Равных цифр нет");
        } else {
            if (hasEqualOnes) {
                System.out.println("Цифра: " + (num1 % 10) + ". Разряд: 1");
            }
            if (hasEqualTens) {
                System.out.println("Цифра: " + ((num1 % 100) / 10) + ". Разряд: 2");
            }
            if (hasEqualHundreds) {
                System.out.println("Цифра: " + (num1 / 100) + ". Разряд: 3");
            }
        }
        
        System.out.println("\n5. Определение символа по его коду");
        char unknownSymbol = '\u0031';
        if (unknownSymbol >= 'A' && unknownSymbol <= 'Z') {
            System.out.println("Символ " + unknownSymbol + " является большой буквой");
        } else if (unknownSymbol >= 'a' && unknownSymbol <= 'z') {
            System.out.println("Символ " + unknownSymbol + " является маленькой буквой");
        } else if (unknownSymbol >= '0' && unknownSymbol <= '9') {
            System.out.println("Символ " + unknownSymbol + " является цифрой");
        } else {
            System.out.println("Символ " + unknownSymbol + " не буква и не цифра");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        System.out.println("Сумма вклада: " + deposit);
        BigDecimal rate = new BigDecimal("0.05");
        if (deposit >= 100000 && deposit <= 300000) {
            rate = new BigDecimal("0.07");
        } else if (deposit > 300000) {
            rate = new BigDecimal("0.10");
        }
        BigDecimal charges = new BigDecimal(deposit).multiply(rate);
        System.out.println("Сумма накопленного процента: " + charges + "\n" +
                "Итоговая сумма с процентами: " + new BigDecimal(deposit).add(charges));
        
        System.out.println("\n7. Определение оценки по предметам");
        int historyRate = 59;
        int historyGrade = 5;
        if (historyRate <= 60) {
            historyGrade = 2;
        } else if (historyRate > 60 && historyRate <= 73) {
            historyGrade = 3;
        } else if (historyRate > 73 && historyRate <= 91) {
            historyGrade = 4;
        }
        
        int programmingRate = 92;
        int programmingGrade = 5;
        if (programmingRate <= 60) {
            programmingGrade = 2;
        } else if (programmingRate > 60 && programmingRate <= 73) {
            programmingGrade = 3;
        } else if (programmingRate > 73 && programmingRate <= 91) {
            programmingGrade = 4;
        }
        
        float averageRate = (historyRate + programmingRate) / 2f;
        float averageMark = (historyGrade + programmingGrade) / 2f;
        
        System.out.println("История — " + historyGrade + "\n" +
                "Программирование — " + programmingGrade + "\n" +
                "Средний балл оценок по предметам — " + averageMark + "\n" +
                "Средний % по предметам — " + averageRate);
        
        System.out.println("\n8. Расчет годовой прибыли");
        BigDecimal revenueMonth = new BigDecimal("13000");
        BigDecimal rentMonth = new BigDecimal("5000");
        BigDecimal productionCostMonth = new BigDecimal("9000");
        
        BigDecimal incomeYear = revenueMonth
                .subtract(rentMonth)
                .subtract(productionCostMonth)
                .multiply(new BigDecimal("12"));
        if (incomeYear.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + incomeYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + incomeYear + " руб.");
        }
    }
}
