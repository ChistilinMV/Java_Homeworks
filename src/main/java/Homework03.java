import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework03 {
    //Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    public static ArrayList<Integer> delODD(ArrayList<Integer> list2del) {
        Iterator<Integer> var1 = list2del.iterator();
        while(var1.hasNext()) {
            int i = (Integer)var1.next();
            if (i % 2 != 0) {
                var1.remove();
            }
        }
        return list2del;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    // Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример:
    // ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
    // ["string", "s", "my_value"]
    public static ArrayList<String> delDigi(ArrayList<String> list2del) {
        Iterator<String> var1 = list2del.iterator();
        while(var1.hasNext()) {
            String i = (String)var1.next();
            if (isNumeric(i)) {
                var1.remove();
            }
        }
        return list2del;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listi = new ArrayList<>(Arrays.asList(1, 1, 3, 4, 4, 6, 7, 7, 9, 10, 8));
        System.out.println(listi);
        System.out.println(delODD(listi));
        ArrayList<String> listd = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(listd);
        System.out.println(delDigi(listd));
    }
}
