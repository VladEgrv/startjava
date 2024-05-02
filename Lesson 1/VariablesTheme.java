import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberCores = 8;
        short vramMb = 8192;
        int ssdMemoryGb = 2048;
        long ramMb = 16384;
        float cpuGgz = 1.3F;
        double weightKg = 4.5D;
        boolean isAvailable = true;
        char operatingSystem = 'W';
        System.out.println("Количество ядер:" + numberCores +
                "\nВидеопамять: " + vramMb + " Mb" +
                "\nПамять: " + ssdMemoryGb + " Gb" +
                "\nОперативная память: " + ramMb + " Mb" +
                "\nЧастота процессора: " + cpuGgz + " GGz" +
                "\nВес: " + weightKg + "кг" +
                "\nВ наличии для покупки: " + isAvailable +
                "\nОперационная система (Windows (W), Linux (L), MacOS (M): " + operatingSystem);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        BigDecimal penCost = new BigDecimal("100");
        BigDecimal bookCost = new BigDecimal("200");
        BigDecimal totalCost = penCost.add(bookCost);
        BigDecimal discountDecimal = new BigDecimal("0.11");
        BigDecimal discountAmount = totalCost.multiply(discountDecimal);
        BigDecimal totalCostWithDiscount = totalCost.subtract(discountAmount);
        System.out.println("Общая стоимость товаров без скидки: " + totalCost +
                "\nСумма скидки: " + discountAmount +
                "\nОбщая стоимость товаров со скидкой: " + totalCostWithDiscount);
        
        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("""
                   J    a  v     v  a
                   J   a a  v   v  a a
                J  J  aaaaa  V V  aaaaa
                 JJ  a     a  V  a     a
                """);
        
        System.out.println("4. Вывод min и max значений числовых типов");
        System.out.println("Тип byte:");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte + "\n" + (++maxByte) + "\n" + (--maxByte));
        
        System.out.println("\nТип short:");
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort + "\n" + (++maxShort) + "\n" + (--maxShort));
        
        System.out.println("\nТип int:");
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt + "\n" + (++maxInt) + "\n" + (--maxInt));
        
        System.out.println("\nТип long:");
        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong + "\n" + (++maxLong) + "\n" + (--maxLong));
        
        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных: \nПеременная 1 = " + num1 +
                "\nПеременная 2 = " + num2);
        
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("\nПерестановка с помощью третьей переменной: \nПеременная 1 = " + num1 +
                "\nПеременная 2 = " + num2);
        
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("\nПерестановка с помощью арифметических операций: \nПеременная 1 = " + num1 +
                "\nПеременная 2 = " + num2);
        
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("\nПерестановка с помощью побитовой операции ^: \nПеременная 1 = " + num1 +
                "\nПеременная 2 = " + num2);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println(dollar + " " + (int) dollar + "\n" +
                asterisk + " " + (int) asterisk + "\n" +
                atSign + " " + (int) atSign + "\n" +
                verticalBar + " " + (int) verticalBar + "\n" +
                tilde + " " + (int) tilde);
        
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        
        System.out.println("    " + slash + backslash +
                "\n   " + slash + "  " + backslash +
                "\n  " + slash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash +
                "\n " + slash + "      " + backslash +
                "\n" + slash + String.valueOf(underscore).repeat(4) + slash + backslash +
                underscore + underscore + backslash);
        
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int originalNumber = 123;
        int numberHundreds = originalNumber / 100;
        int numberTens = (originalNumber % 100) / 10;
        int numberOnes = originalNumber % 10;
        int productDigits = numberHundreds * numberTens * numberOnes;
        int sumDigits = numberHundreds + numberTens + numberOnes;
        System.out.println("Число " + originalNumber + " содержит:\n" +
                "  сотен — " + numberHundreds + "\n" +
                "  десятков — " + numberTens + "\n" +
                "  единиц – " + numberOnes + "\n" +
                "Сумма его цифр = " + sumDigits + "\n" +
                "Произведение = " + productDigits);
        
        System.out.println("\n9. Вывод времени");
        int rawSeconds = 86399;
        int hh = (rawSeconds / 60) / 60;
        int mm = (rawSeconds / 60) % 60;
        int ss = rawSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
