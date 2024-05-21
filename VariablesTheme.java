public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера: ");
 
        byte vramAmount = 6;
        double cpuFrequency = 2.90;
        long ramSize = 32;
        short hddSize = 1;
        int ssdSize = 232;;
        float cpuCores = 6;
        boolean isPcOn = true;
        System.out.println("\nВидеопамять: " + vramAmount + 
                "\nЧастота процессора: " + cpuFrequency + 
                "\nОбъём оперативки: " + ramSize + 
                "\nПамять жесткого диска: " + hddSize + 
                "\nПамять ssd: " + ssdSize + 
                "\nядра процессора" + cpuCores + 
                "\nпк включен: ");

        System.out.println("\n2. Расчет стоимости товара со скидкой: ");

        double priceBook = 235.83;
        double pricePen = 105.5;
        double discount = 0.11;
        double sum = priceBook + pricePen;
        double totalDiscount = pricePen / 100 * discount + priceBook / 100 * discount;
        double sumDiscount = sum * totalDiscount;
        System.out.println("\nобщую стоимость товаров без скидки: " + sum + 
                "\nсумму скидки: " + totalDiscount + 
                "\nобщую стоимость товаров со скидкой: " + sumDiscount);

        System.out.println("\n\n3. Вывод слова Java\n");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\nИсходное значение byte: " + byteMax + 
                "\nПосле инкремента: " + ++byteMax + 
                "\nПосле декремента: " + --byteMax + 
                "\nИсходное значение short: " + shortMax + 
                "\nПосле инкремента: " + ++shortMax + 
                "\nПосле декремента: " + --shortMax + 
                "\nИсходное значение int: " + intMax + 
                "\nПосле инкремента: " + ++intMax + 
                "\nПосле декремента: " + --intMax + 
                "\nИсходное значение: long: " + longMax + 
                "\nПосле инкремента: " + ++longMax + 
                "\nПосле декремента: " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("\n Исходные значения a и b: " + a + " " + b);

        System.out.println("С помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("С помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("С помощью побитовой операции");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("\n6. Вывод символов и их кодов");




        System.out.println("\n7 Вывод в консоль ASCII-арт Дюка");



        System.out.println("\n8 Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = (number / 100);
        int tens = (number / 10) % 10;
        int ones = 3;
        int sum1 = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("число number содержит: " + number + 
                "\nсотни -"+ hundreds + 
                "\nдесятки -" + tens + 
                "\nединицы -" + ones + 
                "\nсумма всех цифр =: " + sum1 + 
                "\nпроизведение равно =: " + product);

        System.out.println("\n9 Вывод времени");
        int totalSec = 86399;
        int hh = (totalSec / 3600);
        int mm = (totalSec % 3600) / 60;
        int ss = totalSec % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}

