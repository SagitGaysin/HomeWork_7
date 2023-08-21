public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        /* Условие задачи:
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
         что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы.
         Формат сообщения: «Месяц …, сумма накоплений равна … рублей»
         */

        //Решение задачи:
        int instalment = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
           total = total + instalment;
           i++;
           System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        /* Условие задачи:
        Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        */

        //Решение задачи:
        int i = 0;
        int a = 10;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (; a >= 1; a = a - 1) {
            System.out.print(" " + a + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");

        /* Условие задачи:
        В стране Y население равно 12 миллионов человек.Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
         */

        int year = 0;
        int headCount = 12_000_000;
        int birthRate = (headCount / 1000) * 17;
        int mortality = (headCount / 1000) * 8;
        for (; year <= 10; year++) {
            headCount = headCount + birthRate - mortality;
            System.out.println("Год " + year + " численность населения составляет " + headCount);
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        /*Условие задачи:
        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        Первоначальная сумма вклада — 15 тысяч рублей.Вычислите и выведите в консоль, сколько месяцев Василию нужно
        будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
        а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
         */

        //Решение:
        float inintialAmount = 15_000f;
        for (int i = 1; inintialAmount <= 12_000_000; i++) {
            inintialAmount = (float) ((float) inintialAmount * 1.07);
            System.out.printf("Месяц " + i + " сумма накоплений " + "%.2f", inintialAmount);
            System.out.println();
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        /* Условие задачи:
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
         */

        //Решение:
        float inintialAmount = 15_000f;
        for (int i = 1; inintialAmount <= 12_000_000; i++) {
            inintialAmount = (float) ((float) inintialAmount * 1.07);
            if (i % 6 == 0) {
                System.out.printf("Месяц " + i + " сумма накоплений " + "%.2f", inintialAmount);
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        /* Условие задачи:
        Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые
        полгода на протяжении этих 9 лет. Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
         */

        //Решение:
        float inintialAmount = 15_000f;
        int i = 1;
        for (; i <= 108; i++) {
            inintialAmount = (float) ((float) inintialAmount * 1.07);
            if (i % 6 == 0) {
                System.out.printf("Месяц " + i + " сумма накоплений " + "%.2f", inintialAmount);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        /*Условие задачи:
        В компании пятница — отчетный день.Нужно написать программу, которая считает дни месяца по датам, определяет,
        какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.Создайте
        переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7). Выведите на каждую
        пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо
        подготовить отчет».В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с
        напоминаниями по разным датам.
        */

        //Решение:
        int friday = 5;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        /*Условие задачи:
        Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.Известно, что
        комета пролетает каждый 79-й год, начиная с нулевого.В консоль нужно вывести все годы за последние 200 лет,
        когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).Для вычисления периода можно
        создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
         в качестве старта и 100 лет после в качестве завершения периода расчета.В результате решения задачи в консоли
         должен получиться следующий результат:
         1896
         1975
         2054
         */

        //Решение:
        int year = 2023;
        int beforeYears = year - 200;
        int afterYears = year + 100;
        for (year = beforeYears; year < afterYears; year ++) {
            if (year % 79 == 0)
                System.out.println(year);
        }
    }
}