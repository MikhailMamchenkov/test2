import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbersAndNames = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Сергей");
        names.add("Анатолий");
        names.add("Василий");
        names.add("Иван");
        names.add("Григорий");
        names.add("Михаил");
        names.add("Дмитрий");
        names.add("Алексей");
        names.add("Александр");
        names.add("Никита");
        for (int i = 0; i < names.size(); i++) {
            String rr = numbers.get(i) + " - " + names.get(i);
            numbersAndNames.add(rr);
        }
        for (String s : numbersAndNames) {
            System.out.println(s);
        }

    }
}
