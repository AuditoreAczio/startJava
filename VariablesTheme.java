public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера: ");
 
        byte vramAmount = 6;
        System.out.println(vramAmount);

        double cpuFrequency = 2.90;
        System.out.println(cpuFrequency);

        long ramSize = 32;
        System.out.println(ramSize);

        short hddSize = 1;
        System.out.println(hddSize);

        int ssdSize = 232;
        System.out.println(ssdSize);

        float cpuCores = 6;
        System.out.println(cpuCores);

        boolean isPcOn = true;
        System.out.println(isPcOn);

        System.out.println("\n2. Расчет стоимости товара со скидкой: ");

        int priceBook = 235;
        int pricePen = 105;
        int discount = 11;
        int sum = priceBook + pricePen;
        double totalDis = pricePen / 100 * discount + priceBook / 100 * discount;
        double sumDiscount = sum - totalDis;
        System.out.println("sum: " + sum + ", totalDis: " + totalDis + ", sumDiscount: " + sumDiscount);

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
        System.out.println("Исходное значение byte: " + byteMax +
        "\nПосле инкремента: " + ++byteMax +
        "\nПосле декремента: " + --byteMax +
        "Исходное значение short: " + shortMax +
        "\nПосле инкремента: " + ++shortMax +
        "\nПосле декремента: " + --shortMax +
        "Исходное значение int: " + intMax +
        "\nПосле инкремента: " + ++intMax +
        "\nПосле декремента: " + --intMax +
        "Исходное значение: long" + longMax +
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
        int n = 123;
        int x = (n / 100) % 10;
        int y = (n / 10) % 10;
        int z = (n / 1) % 10;
        int s = z + y + x;
        int p = z * y * x;
        System.out.println("z: " + z + ", y: " + y + ", x: " + x + ", s: " + s + ", p: " + p);

        System.out.println("\n9 Вывод времени");
        int totalSec = 86399;
        int hh = (totalSec / 3600);
        int mm = (totalSec % 3600) / 60;
        int ss = totalSec % 60;
        System.out.println("hh: " + hh + ", mm: " + mm + ", ss: " + ss);
    }
}

