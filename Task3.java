import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task3 {
    private Map<String, Integer> collection = new HashMap<>();

    public void addMap () {
        collection.put("Иван", 123456);
        collection.put("Петр", 723486);
        collection.put("Артем", 423756);
        collection.put("Денис", 143456);
        collection.put("Роман", 223456);
    }
    public void changeMap(String key, int value) {
        if (collection.containsKey(key) && collection.get(key).equals(value)) {
            throw new IllegalArgumentException();
        } collection.put(key, value);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3 task3 = (Task3) o;
        return Objects.equals(collection, task3.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    @Override
    public String toString() {
        return "Task3{" +
                "collection=" + collection +
                '}';
    }
}
