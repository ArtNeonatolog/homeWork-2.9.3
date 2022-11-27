import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Task3 task = new Task3();

        task.addMap();
        System.out.println(task);

        task.changeMap("Олег", 123456);

        System.out.println(task);

    }
}
