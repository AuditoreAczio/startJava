public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера: ");
 
        byte theAmountOfVideoMemory = 6;
        System.out.println(theAmountOfVideoMemory);

        double processorFrequency = 2.90;
        System.out.println(processorFrequency);

        long ramSize = 32;
        System.out.println(ramSize);

        short hddSize = 1;
        System.out.println(hddSize);

        int ssdSize = 232;
        System.out.println(ssdSize);

        float processorCores = 6;
        System.out.println(processorCores);

        boolean computerWork = true;
        System.out.println(computerWork);

        System.out.println("\n2. Расчет стоимости товара со скидкой: ");

        int priceBook = 235;
        int pricePen = 105;
        int discount = 11;
        int sum = priceBook + pricePen;
        int sumDiscount = pricePen / 100 * discount + priceBook / 100 * discount;
        int sumWithDiscount = sum - sumDiscount;
        System.out.println(sumWithDiscount);

        System.out.println("\n\n3. Вывод слова Java\n");
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a" +
                "\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte ma = 127;
        short j = 32_767;
        int r = 2_147_483_647;
        long t = 1_854_775_807;
        ma++;
        j++;
        r++; 
        t++;

        System.out.println("ma: " + ma + ", j: " + j + ", r: " + r + ", t: " + t);
        byte l = 127;
        short g = 32_767;
        int m = 2_147_483_647;
        long na = 1_854_775_807;
        l--;
        g--;
        m--;
        na--;
        System.out.println("l: " + l + ", g: " + g + ", m: " + m + ", na: " + na);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("\n Исходные значения");

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
        int z = (n / 1) % 10;
        int y = (n / 10) % 10;
        int x = (n / 100) % 10;
        int s = z + y + x;
        int p = z * y * x;
        System.out.println("z: " + z + ", y: " + y + ", x: " + x + ", s: " + s + ", p: " + p);

        System.out.println("\n8 Вывод времени");
        int totalSec = 86399;
        int hour = (totalSec / 3600);
        int minutes = (totalSec % 3600) / 60;
        int sec = totalSec % 60;
        System.out.println("hour: " + hour + ", minutes: " + minutes + ", sec: " + sec);
    }
}

