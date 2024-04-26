public class CyclesTheme {
    public static void main(String[] args) {
        int startSegment = -10;
        int endSegment = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int startSegmentCopy = startSegment;
        do {
            if (startSegmentCopy % 2 == 0) {
                sumEven += startSegmentCopy;
            } else {
                sumOdd += startSegmentCopy;
            }
            startSegmentCopy += 1;
        } while (startSegmentCopy <= endSegment);
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
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int initNumber = 1234;
        int sumDigits = 0;
        while (initNumber > 0) {
            int lastNumber = initNumber % 10;
            sumDigits += lastNumber;
            System.out.print(lastNumber);
            initNumber /= 10;
        }
        System.out.println("\n" + sumDigits);
        
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
                lineCounter++;
            }
        }
        
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        initNumber = 3242592;
        int initNumberCopy = initNumber;
        int countTwos = 0;
        while (initNumberCopy > 0) {
            if (initNumberCopy % 10 == 2) {
                countTwos++;
            }
            initNumberCopy /= 10;
        }
        String evenOrOdd = "нечетное";
        if (countTwos % 2 == 0) {
            evenOrOdd = "четное";
        }
        System.out.println("В " + initNumber + " " + evenOrOdd + " количество двоек — " + countTwos);
        
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
            int counter = symbolCount;
            while (counter != 0) {
                System.out.print("#");
                counter--;
            }
            System.out.println();
            symbolCount--;
            rows--;
        }
        System.out.println();
        
        int height = 3;
        int num = 1;
        boolean increasing = true;
        do {
            int counter = 0;
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
        char symbol;
        for (int i = 33; i < 48; i += 2) {
            symbol = (char) i;
            description = Character.getName(i);
            System.out.printf("  %-12s%-13s%-20s\n", i, symbol, description);
        }
        for (int i = 98; i <= 122; i += 2) {
            symbol = (char) i;
            description = Character.getName(i);
            System.out.printf("  %-12s%-13s%-20s\n", i, symbol, description);
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        initNumber = 1234321;
        int reversedNum = 0;
        initNumberCopy = initNumber;
        while (initNumberCopy > 0) {
            reversedNum = (reversedNum * 10) + (initNumberCopy % 10);
            initNumberCopy /= 10;
        }
        String state = "является";
        if (initNumber != reversedNum) {
            state = "не является";
        }
        System.out.println("Число " + initNumber + " " + state + " палиндромом");
        
        System.out.println("\n9. Проверка, является ли число счастливым");
        initNumber = 123321;
        int digits = 6;
        int halfDigits = digits / 2;
        int countPart1 = 0;
        int countPart2 = 0;
        int divider = 1000;
        
        int firstHalf = initNumber / divider;
        int secondHalf = initNumber % divider;
        
        while (halfDigits > 0) {
            countPart1 += firstHalf % 10;
            firstHalf /= 10;
            countPart2 += secondHalf % 10;
            secondHalf /= 10;
            halfDigits--;
        }
        state = "является";
        if (countPart1 != countPart2) {
            state = "не является";
        }
        System.out.println("Число " + initNumber + " " + state + " счастливым\n" +
                "Сумма цифр первой половины = " + countPart1 +
                ", а сумма цифр второй половины = " + countPart2);
        
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
