import java.util.*;
public class NumbersBook {
    private Map<String, HashSet<String>> map;

    NumbersBook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.get(lastName) == null) {
            numbers = new HashSet<>();
        }
        else {
            numbers = map.get(lastName);
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}

