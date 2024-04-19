import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte coresNum = 8;
        short vramMb = 8192;
        int memoryGb = 2048;
        long ramMb = 16384;
        float cpuGgz = 1.3F;
        double weightKg = 4.5D;
        boolean isAvailable = true;
        char operatingSystem = 'W';
        System.out.println("Количество ядер:" + coresNum +
                "\nВидеопамять: " + vramMb + " Mb" +
                "\nПамять: " + memoryGb + " Gb" +
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
        
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("""
                
                   J    a  v     v  a     \
                
                   J   a a  v   v  a a        \
                
                J  J  aaaaa  V V  aaaaa    \
                
                 JJ  a     a  V  a     a
                """);
        
        System.out.println("4. Вывод min и max значений числовых типов");
        System.out.println("Тип byte:");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        maxByte++;
        System.out.println(maxByte);
        maxByte--;
        System.out.println(maxByte);

        System.out.println("\nТип short:");
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);
        maxShort++;
        System.out.println(maxShort);
        maxShort--;
        System.out.println(maxShort);
        
        System.out.println("\nТип int:");
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);
        maxInt++;
        System.out.println(maxInt);
        maxInt--;
        System.out.println(maxInt);
        
        System.out.println("\nТип long:");
        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong);
        maxLong++;
        System.out.println(maxLong);
        maxLong--;
        System.out.println(maxLong);
        
        System.out.println("\n5. Перестановка значений переменных");
        int variable1 = 2;
        int variable2 = 5;
        System.out.println("Исходные значения переменных: \nПеременная 1 = " + variable1 +
                "\nПеременная 2 = " + variable2);
        
        int variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;
        System.out.println("\nПерестановка с помощью третьей переменной: \nПеременная 1 = " + variable1 +
                "\nПеременная 2 = " + variable2);
        
        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;
        System.out.println("\nПерестановка с помощью арифметических операций: \nПеременная 1 = " + variable1 +
                "\nПеременная 2 = " + variable2);
        
        variable1 = variable1 ^ variable2;
        variable2 = variable1 ^ variable2;
        variable1 = variable1 ^ variable2;
        System.out.println("\nПерестановка с помощью побитовой операции ^: \nПеременная 1 = " + variable1 +
                "\nПеременная 2 = " + variable2);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '|';
        char symbol5 = '~';
        System.out.println(symbol1 + " " + (int) symbol1 +
                "\n" + symbol2 + " " + (int) symbol2 +
                "\n" + symbol3 + " " + (int) symbol3 +
                "\n" + symbol4 + " " + (int) symbol4 +
                "\n" + symbol5 + " " + (int) symbol5);
        
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        
        
        System.out.println("    " + slash + backslash + "     " +
                "\n   " + slash + "  " + backslash + "    " +
                "\n  " + slash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash + "   " +
                "\n " + slash + "      " + backslash + "  " +
                "\n" + slash + String.valueOf(underscore).repeat(4) + slash + backslash +
                String.valueOf(underscore).repeat(2) + backslash + " ");
        
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int originalNumber = 123;
        int hundredsNum = originalNumber / 100;
        int tensNum = (originalNumber % 100) / 10;
        int onesNum = originalNumber % 10;
        int productDigits = hundredsNum * tensNum * onesNum;
        int sumDigits = hundredsNum + tensNum + onesNum;
        System.out.println("Число " + originalNumber + " содержит:" +
                "\n  сотен — " + hundredsNum +
                "\n  десятков — " + tensNum +
                "\n  едниц – " + onesNum +
                "\nСумма его цифр = " + sumDigits +
                "\nПроизведение = " + productDigits);
        
        System.out.println("\n9. Вывод времени");
        int rawSeconds = 86399;
        int hours = (rawSeconds / 60) / 60;
        int minutes = (rawSeconds / 60) % 60;
        int seconds = (rawSeconds % 60) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
