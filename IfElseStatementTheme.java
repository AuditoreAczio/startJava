public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
    boolean maleGender = true;
    if(!maleGender) {
        System.out.println("в армию");
    } else {
        System.out.println("не в армию");
    }

    int age = 15;
    if(age > 18){
        System.out.println("водить машину можно");
    } else {
        System.out.println("водить машину нельзя");
    }

    double weight = 1.8;
    if(weight < 1.8) {
        System.out.println("увеличение роста с прошлого года");
    } else {
        System.out.println("рост не изменился");
    }

    char firstLetterName = "Mike".charAt(0);
    if(firstLetterName == 'M') {
        System.out.println("Выдать паспорт");
    }else if (firstLetterName == 'I') {
        System.out.println("Задать вопросы тому кто пришел");
    }else{
        System.out.println("Не выдавать паспорт");
    }

    System.out.println("\n2. Поиск большего числа");
    int price = 87;
    int speed = 67;
    if(price > speed) {
        System.out.println("Да верно");
    }else if(price == speed){
        System.out.println("Нет не верно");
    }else{
        System.out.println("Не верно");
    }
    
    System.out.println("\n3. Проверка числа");
    int number = 50;
    if(number > 0){
        if(number % 2 == 0){
            System.out.println("50 является четным и положительным");
        } else if(number == 0){
            System.out.println("является нулем");
        }
    }

    System.out.println("\n4. Поиск одинаковых цифр в числах");
    int meters = 123;
    int series = 223;
    if(meters == age){
        System.out.println("все числа равны ");
    } else {
    int ones1 = meters % 10;
    int tens1 = meters / 10 % 10;
    int hundreds1 = meters / 100 % 10;
    int ones2 = series % 10;
    int tens2 = series / 10 % 10;
    int hundreds2 = series / 100 % 10;
    if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
        System.out.println("Нет совпадающих цифр, все разряды разные");
    } else {
         if (ones1 == ones2) System.out.println("Единицы равны");
        if (tens1 == tens2) System.out.println("Десятки равны");
        if (hundreds1 == hundreds2) System.out.println("Сотни равны");
     }
     }

    System.out.println("\n5. Определение символа по его коду");


    System.out.println("\n6. Подсчет начисленных банком %");
    double depositAmount = 321123;
        double rate = 0.05;
        if (depositAmount >= 100000 && depositAmount <= 300000) {
            rate = 0.07;
        } else if (depositAmount > 300000) {
            rate = 0.1;
        }

        double rateSum = (depositAmount * rate) / 100;
        double finalSum = depositAmount + rateSum;

        System.out.println("Сумма:сумму вклада , :" + depositAmount);
        System.out.println("сумму начисленного % , :" + rateSum);
        System.out.println("итоговую сумму с % , :" + finalSum);


    System.out.println("\n7. Определение оценки по предметам");
    int historyGrade = 2;
              int programmingGrade = 5;
    double historyPercentage = 0.59;
    if (historyPercentage > 0.60 & historyPercentage < 0.73) {
        historyGrade = 3;
    } else if (historyPercentage > 0.73 & historyPercentage < 0.91) {
        historyGrade = 4;
    } else if (historyPercentage > 0.91) {
        historyGrade = 5;
    }
     double programmingPercentage = 0.92;
    if (programmingPercentage > 0.60 & programmingPercentage < 0.73) {
        programmingGrade = 3;
    } else if (programmingPercentage > 0.73 & programmingPercentage < 0.91) {
        programmingGrade = 4;
    } else if (programmingPercentage > 0.91) {
        programmingGrade = 5;
    }
    double gpa = (historyGrade + programmingGrade) / 2;
    double averagePercent = (historyPercentage + programmingPercentage) / 2;
    System.out.println("Оценка по истории: " + historyGrade);
    System.out.println("Оценка по программированию: " + programmingGrade);
    System.out.println("Cредний процент по предметам: " + averagePercent);
    System.out.println("Средний балл оценок по предмету: " + gpa);

    // gpa - grade point average
    
    System.out.println("\n8. Расчет годовой прибыли");
    double sale = 13025.233;
    double rent = 5123.018;
    double production = 9001.729;
    double proffit;

    if (production + rent < sale) {
      proffit = +321.01;
    } else if (production + rent > sale) {
        proffit = -123.12;
    }
    double annualProffit = (production + rent - sale) * 12;
    System.out.println("Прибыль за год: " + annualProffit);
  }
}