public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startCycle = -10;
        int endCycle = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = startCycle;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter += 1;
        } while (counter <= endCycle);
        System.out.println("В отрезке [" + startCycle + ", " + endCycle + "] сумма четных чисел = " +
                sumEven + ", а нечетных = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        
        int minNum = num1;
        if (minNum > num2) {
            minNum = num2;
        }
        if (minNum > num3) {
            minNum = num3;
        }
        int maxNum = num1;
        if (maxNum < num2) {
            maxNum = num2;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sumDigits = 0;
        while (num1 != 0) {
            sumDigits += num1 % 10;
            System.out.print(num1 % 10);
            num1 /= 10;
        }
        System.out.println("\n" + sumDigits);
        
        System.out.println("\n4. Вывод чисел в несколько строк");
        counter = 0;
        for (int i = 1 + 1; i <= 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                counter += 1;
                if (counter % 5 == 0) {
                    System.out.println();
                }
            }
        }
        if (counter % 5 != 0) {
            while (counter % 5 != 0) {
                System.out.printf("%3d", 0);
                counter += 1;
            }
        }
        System.out.println();
        
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        num1 = 3242592;
        num2 = num1;
        String evenOdd = "нечетное";
        counter = 0;
        while (num2 != 0) {
            if (num2 % 10 == 2) {
                counter += 1;
            }
            num2 /= 10;
        }
        if (counter % 2 == 0) {
            evenOdd = "четное";
        }
        System.out.println("В " + num1 + " " + evenOdd + " количество двоек — " + counter);
        
        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        int rows = 5;
        int symbolCount = 5;
        while (rows != 0) {
            counter = symbolCount;
            while (counter != 0) {
                System.out.print("#");
                counter -= 1;
            }
            System.out.println();
            symbolCount -= 1;
            rows -= 1;
        }
        System.out.println();
        
        int height = 3;
        num1 = 1;
        boolean increasing = true;
        do {
            counter = 0;
            do {
                System.out.print("$");
                counter++;
            } while (counter < num1);
            System.out.println();
            if (increasing) {
                num1++;
                if (num1 > height) {
                    increasing = false;
                    num1 -= 2;
                }
            } else {
                num1--;
            }
        } while (num1 > 0);
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%-25s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        String description;
        for (int i = 33; i < 48; i += 2) {
            char c = (char) i;
            description = Character.getName(i);
            System.out.printf("  %-12s%-13s%-20s\n", i, c, description);
        }
        for (int i = 98; i <= 122; i += 2) {
            char c = (char) i;
            description = Character.getName(i);
            System.out.printf("  %-12s%-13s%-20s\n", i, c, description);
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int originalNum = 1234321;
        int reversedNum = 0;
        int tempNum = originalNum;
        while (tempNum != 0) {
            reversedNum = (reversedNum * 10) + (tempNum % 10);
            tempNum /= 10;
        }
        String isPalindrome = "является";
        if (originalNum != reversedNum) {
            isPalindrome = "не является";
        }
        System.out.println("Число " + originalNum + " " + isPalindrome + " палиндромом");
        
        System.out.println("\n9. Проверка, является ли число счастливым");
        originalNum = 123321;
        int shortNum = originalNum;
        int shortReversedNum = 0;
        int countPart1 = 0;
        int countPart2 = 0;
        while (shortNum != (originalNum / 1000)) {
            shortReversedNum = (shortReversedNum * 10) + (shortNum % 10);
            countPart2 += shortNum % 10;
            shortNum /= 10;
        }
        int shortNum2 = 0;
        int tempShortNum = shortNum;
        while (shortReversedNum != 0) {
            shortNum2 = (shortNum2 * 10) + (shortReversedNum % 10);
            shortReversedNum /= 10;
            countPart1 += tempShortNum % 10;
            tempShortNum /= 10;
        }
        String isHappy = "является";
        if (countPart1 != countPart2) {
            isHappy = "не является";
        }
        System.out.println("Число " + originalNum + " " + isHappy + " счастливым\n" +
                "Сумма цифр " + shortNum + " = " + countPart1 +
                ", а сумма цифр " + shortNum2 + " = " + countPart2);
        
        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        int start = 2;
        int end = 9;
        
        System.out.printf("%4s", "");
        for (int i = start; i <= end; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        System.out.printf("%4s", "");
        for (int i = start; i <= end; i++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = start; i <= end; i++) {
            System.out.printf("%2d |", i);
            for (int j = start; j <= end; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
