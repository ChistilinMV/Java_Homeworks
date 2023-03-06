public class Homework01 {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false

    System.out.println();
    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(-3)); // false

    System.out.println();
    printString("abcd", 5); // abcdabcdabcdabcdabcd

    System.out.println();
    System.out.println(isLeapYear(1988));
    System.out.println(isLeapYear(1700));
    System.out.println(isLeapYear(1600));

    System.out.println();
    printArray(createArray(10, 7));

    System.out.println();
    zeroOne();

    System.out.println();
    sixx2();

    int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
    int x = array[2][3]; // не понял зачем нам этот элемент

    diagonal(array);
}
private static void printArray(int[] inArray){
        for (int y:inArray) System.out.print(y + " ");
        System.out.println();
}

private static void print2dArray(int[][] in2dArray){
    for (int[] x1:in2dArray){
        for (int x2:x1){
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
    int sum = a + b;
    return sum >= 10 & sum <= 20;
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    return x > 0;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    for (int i = 0; i < repeat; i++) {
        System.out.print(source);
    }
    System.out.println();
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    return (year % 4 == 0) && (year % 100 != 0) | (year % 400 == 0);
}

private static int[] createArray(int len, int initalValue) {
    // должен вернуть массив длины len, каждое значение которого равно initialValue
    int[] array1 = new int[len];
    for (int i = 0; i < len; i++) {
        array1[i] = initalValue;
    }
    return array1;
    //return null;
}

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */

private static void zeroOne() {
    int[] binMass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    printArray(binMass);
    for (int i = 0; i < binMass.length; i++) binMass[i] = binMass[i] ^ 1;
    printArray(binMass);
}
private static void sixx2() {
    int[] sixMass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    printArray(sixMass);
    for (int i = 0; i < sixMass.length; i++) if (sixMass[i] < 6) sixMass[i] *= 2;
    printArray(sixMass);
}

private static void diagonal(int[][] in2dArray){
    System.out.println();
    print2dArray(in2dArray);
    for (int i = 0; i < in2dArray.length; i++) {
        for (int j = 0; j < in2dArray[0].length; j++) {
            if (i == j) in2dArray[i][j] = 1; //главная диагональ
            if (j == (in2dArray.length - i - 1)) in2dArray[i][j] = 1; //побочная диагональ
        }
    }
    System.out.println();
    print2dArray(in2dArray);
}

}