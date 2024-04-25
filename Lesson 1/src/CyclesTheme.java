public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = startSegment;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter += 1;
        } while (counter <= endSegment);
        System.out.println("В отрезке [" + startSegment + ", " + endSegment + "] сумма четных чисел = " +
                sumEven + ", а нечетных = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int initNumber = 1234;
        int sumDigits = 0;
        while (initNumber != 0) {
            int lastNumber = initNumber % 10;
            sumDigits += lastNumber;
            System.out.print(lastNumber);
            initNumber /= 10;
        }
        System.out.println(sumDigits);
        
        System.out.println("\n4. Вывод чисел в несколько строк");
        int lineCounter = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                lineCounter++;
                if (lineCounter % 5 == 0) {
                    System.out.println();
                }
            }
        }
        if (lineCounter % 5 != 0) {
            while (lineCounter % 5 != 0) {
                System.out.printf("%3d", 0);
                lineCounter += 1;
            }
        }
        
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        initNumber = 3242592;
        int initNumberCopy = initNumber;
        int countTwos = 0;
        while (initNumberCopy != 0) {
            if (initNumberCopy % 10 == 2) {
                countTwos += 1;
            }
            initNumberCopy /= 10;
        }
        String evenOdd = "нечетное";
        if (countTwos % 2 == 0) {
            evenOdd = "четное";
        }
        System.out.println("В " + initNumber + " " + evenOdd + " количество двоек — " + countTwos);
        
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
        int num = 1;
        boolean increasing = true;
        do {
            counter = 0;
            do {
                System.out.print("$");
                counter++;
            } while (counter < num);
            System.out.println();
            if (increasing) {
                num++;
                if (num > height) {
                    increasing = false;
                    num -= 2;
                }
            } else {
                num--;
            }
        } while (num > 0);
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%-25s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        String description;
        for (int i = 33; i < 48; i += 2) {
            c = (char) i;
            description = Character.getName(i);
            System.out.printf("  %-12s%-13s%-20s\n", i, c, description);
        }
        for (int i = 98; i <= 122; i += 2) {
            c = (char) i;
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
