import java.util.*;

public class SortHasMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Elephant");
        map.put(4, "Tiger");
        map.put(1, "Dog");
        map.put(6, "Cat");
        map.put(5, "Ant");
        map.put(3, "Snake");
        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());

        //sorted by key
        System.out.println("\n");
        System.out.println("Map sorted by Key =");
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> key, Map.Entry<Integer, String> t1) {
                return key.getKey().compareTo(t1.getKey());
            }
        });
        for (Map.Entry<Integer, String> item: list) {
            System.out.println(item);
        }

        //sorted by value
        System.out.println("\n");
        System.out.println("Map sorted by Value =");
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> value, Map.Entry<Integer, String> t1) {
                return value.getValue().compareTo(t1.getValue());
            }
        });
        for (Map.Entry<Integer, String> item: list) {
            System.out.println(item);
        }
    }
}
