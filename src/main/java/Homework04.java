import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Homework04 {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        /*
         * Реализовать консольное приложение, которое:
         *
         * 1. Принимает от пользователя строку вида text~num
         *
         * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
         * 2. Если введено print~num, выводит строку из позиции num в связном списке.
         * 3. Если введено exit, завершаем программу
         *
         * Пример:
         * string~4
         * num~3
         * print~3
         * > num
         * print~4
         * > string
         * my_value~1
         * print~1
         * > my_value
         */
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split("~");
            String command = parts[0];
            if (parts.length == 2) {
                if (isNumeric(parts[1])) {
                    int num = Integer.parseInt(parts[1]);
                    if (command.equals("print")) {
                        try {
                            System.out.println(list.get(num));
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Выход за пределы массива");
                        }
                    } else {
                        String text = parts[0];
                        while (list.size() <= num) {
                            list.add(null);
                        }
                        list.set(num, text);
                    }
                }
                else {System.out.println("Вторым параметром должно быть число");}
            }
            else {System.out.println("Второй параметр должен быть не пустой");}
        }
    }
}
